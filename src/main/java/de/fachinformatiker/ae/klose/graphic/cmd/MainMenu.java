package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.util.Scanner;

public class MainMenu implements MenuState{
  @Override
  public void showMenu() {
    System.out.println("(1) neue Zeichnung");
    System.out.println("(2) Zeichnungen anzeigen");
    System.out.println("(3) Zeichnung laden");
    System.out.println("(4) Zeichnung speichern");
    System.out.println("(x) Programm beenden");
  }

  @Override
  public MenuState processMenu(Drawing drawing) {
    MenuState state = null;
    Scanner scanner = new Scanner(System.in);
    boolean exit = false;
    while (!exit) {
      String input = scanner.nextLine();
      switch (input) {
        case "1": state = new DrawableMenu();
                  exit = true;
          break;
        case "2":
          break;
        case "3": state = new LoadDrawingMenu();
                  exit = true;
          break;
        case "4":
          break;
        case "x": exit = true;
                  state = null;
          break;
      }
    }
    return state;
  }
}
