package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.util.Scanner;

public class DrawableMenu implements MenuState{
  @Override
  public void showMenu(){
    System.out.println("(1) Hinzufügen");
    System.out.println("(2) Entfernen");
    System.out.println("(3) Anzeigen");
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
        case "3": showDrawing(drawing);
          break;
        case "x": exit = true;
                  state = new MainMenu();
          break;
      }
    }
    return state;
  }

  private void showDrawing(Drawing drawing) {
    System.out.println("Folgende Elemente sind in der Zeichnung vorhanden: ");
    for (int i = 0; i < drawing.getSize(); i++) {
      System.out.println(drawing.getPrimitive(i));
    }
  }
}
