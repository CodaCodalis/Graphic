package de.fachinformatiker.ae.klose.graphic.cmd;

import java.util.Scanner;

public class MainMenu implements MenuState{
  @Override
  public void showMenu() {
    System.out.println();
    System.out.println(">Hauptmenü");
    System.out.println("(1) Zeichnung öffnen");
    System.out.println("(2) Zeichnung laden");
    System.out.println("(3) Zeichnung speichern");
    System.out.println("(x) Programm beenden");
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
        case "1": state = new DrawableMenu();
                  exit = true;
          break;
        case "2": state = new LoadDrawingMenu();
                  exit = true;
          break;
        case "3": state = new SaveDrawingMenu();
                  exit = true;
          break;
        case "x": exit = true;
                  state = null;
          break;
      }
    }
    return state;
  }
}
