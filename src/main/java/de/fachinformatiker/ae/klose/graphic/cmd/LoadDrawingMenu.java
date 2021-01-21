package de.fachinformatiker.ae.klose.graphic.cmd;

import java.util.Scanner;

public class LoadDrawingMenu implements MenuState {

  @Override
  public void showMenu() {
    System.out.println();
    System.out.println(">>Lademenü");
    System.out.println("(1) Dateiname eingeben");
    System.out.println("(x) zurück");
    System.out.print("Eingabe: ");
  }

  @Override
  public MenuState processMenu(MenuOperation menuOperation) {
    MenuState state = null;
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      String input = scanner.nextLine();
      switch (input) {
        case "1":
          System.out.println("Dateinamen, der zu ladenden Datei eingeben: ");
          String filename = scanner.nextLine();
          menuOperation.loadDrawing(filename);
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
}
