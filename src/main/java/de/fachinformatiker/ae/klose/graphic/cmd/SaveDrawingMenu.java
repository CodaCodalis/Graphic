package de.fachinformatiker.ae.klose.graphic.cmd;

import java.util.Scanner;

public class SaveDrawingMenu implements MenuState{

  @Override
  public void showMenu() {
    System.out.println();
    System.out.println(">>Speichermenü");
    System.out.println("(1) Dateiname eingeben");
    System.out.println("(x) zurück");
    System.out.println("Eingabe: ");
  }

  @Override
  public MenuState processMenu(MenuOperation menuOperation) {
    MenuState state = null;
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      String input = scanner.nextLine();
      switch (input) {
        case "1": System.out.println("Dateinamen, der zu speichernden Datei eingeben: ");
                  String filename = scanner.nextLine();
                  saveDrawing(filename, menuOperation);
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

  private void saveDrawing (String filename, MenuOperation menuOperation) {
  menuOperation.saveDrawing(filename);

  }
}