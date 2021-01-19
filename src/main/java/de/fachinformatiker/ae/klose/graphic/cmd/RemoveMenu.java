package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.util.Scanner;

public class RemoveMenu implements MenuState{
  @Override
  public void showMenu() {
    System.out.println("(1) Entfernen nach Index");
    System.out.println("(2) Entfernen nach Objektname");
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
        case "2":
          break;
        case "x":
          exit = true;
          state = new DrawableMenu();
          break;
      }
    }
    return state;
  }
}
