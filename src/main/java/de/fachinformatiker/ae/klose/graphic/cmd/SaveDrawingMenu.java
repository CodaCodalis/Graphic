package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class SaveDrawingMenu implements MenuState{

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
        case "1": System.out.println("Dateinamen, der zu speichernden Datei eingeben: ");
                  String filename = scanner.nextLine();
                  saveDrawing(filename, drawing);
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

  private void saveDrawing (String filename, Drawing drawing) {

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
}