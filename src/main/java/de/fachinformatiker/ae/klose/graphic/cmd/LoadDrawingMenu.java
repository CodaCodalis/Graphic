package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class LoadDrawingMenu implements MenuState {

  @Override
  public void showMenu() {
    System.out.println("(1) Dateiname eingeben");
    System.out.println("(x) zurück");
  }

  @Override
  public MenuState processMenu(Drawing drawing) {
    MenuState state = null;
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      String input = scanner.nextLine();
      switch (input) {
        case "1":
          System.out.println("Dateinamen, der zu ladenden Datei eingeben: ");
          String filename = scanner.nextLine();
          drawing = loadDrawing(filename);
          state = new SaveDrawingMenu();
          exit = true;
          break;
        case "x":
          exit = true;
          state = new MainMenu();
          break;
      }
    }
    return state;
  }

  private Drawing loadDrawing(String filename) {
    InputStream fis = null;

    try {
      fis = new FileInputStream(filename);
      ObjectInputStream o = new ObjectInputStream(fis);
      Drawing drawing = (Drawing) o.readObject();

      System.out.println("Folgende Elemente sind in der Zeichnung vorhanden: ");
      for (int i = 0; i < drawing.getSize(); i++) {
        System.out.println(drawing.getPrimitive(i));
      }

      System.out.println("Datei erfolgreich geladen!");

      return drawing;

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
    return null;
  }
}
