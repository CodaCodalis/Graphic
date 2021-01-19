package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

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
