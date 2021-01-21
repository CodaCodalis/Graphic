package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.io.*;

public class Menu implements MenuOperation {
  private MenuState state = new MainMenu();
  private Drawing drawing = new Drawing();

  private void showMenu() {
    state.showMenu();
  }

  private MenuState processMenu() {
    return state.processMenu(this);
  }

  private void handleMenu() {
    while (state != null) {
      showMenu();
      state = processMenu();
    }
  }

  @Override
  public Drawing getDrawing() {
    return drawing;
  }

  @Override
  public void saveDrawing(String filename) {
    OutputStream fos = null;

    try {
      fos = new FileOutputStream(filename);
      ObjectOutputStream o = new ObjectOutputStream(fos);
      o.writeObject(drawing);
      System.out.println("Zeichnung erfolgreich in \"" + filename + "\" gespeichert!");
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        fos.close();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }

  }

  @Override
  public void loadDrawing(String filename) {
    InputStream fis = null;

    try {
      fis = new FileInputStream(filename);
      ObjectInputStream o = new ObjectInputStream(fis);
      Drawing drawing = (Drawing) o.readObject();

      System.out.println("Folgende Elemente sind in der Zeichnung vorhanden: ");
      for (int i = 0; i < drawing.getSize(); i++) {
        System.out.println(drawing.getPrimitive(i));
      }

      this.drawing = drawing;

      System.out.println("Datei erfolgreich geladen!");

    } catch (IOException e) {
      System.err.println(e);
    } catch (ClassNotFoundException e) {
      System.err.println(e);
    } finally {
      try {
        fis.close();
      } catch (Exception e) {
      }
    }
  }

  public static void main(String[] args) {
    Menu menu = new Menu();
    menu.handleMenu();
  }
}
