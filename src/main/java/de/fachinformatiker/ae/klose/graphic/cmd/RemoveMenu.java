package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

import java.util.Scanner;

public class RemoveMenu implements MenuState{
  @Override
  public void showMenu() {
    System.out.println();
    System.out.println(">>>Entfernenmenü");
    System.out.println("(1) Anzeigen");
    System.out.println("(2) Entfernen nach Index");
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
        case "1": showDrawing(menuOperation);
                  state = new RemoveMenu();
                  exit = true;
          break;
        case "2": removePrimitive(menuOperation);
                  state = new RemoveMenu();
                  exit = true;
          break;
        case "x":
          exit = true;
          state = new DrawableMenu();
          break;
      }
    }
    return state;
  }

  private void removePrimitive(MenuOperation menuOperation){
    int index = menuOperation.getDrawing().getSize();
    System.out.println();
    System.out.println("Anzahl Indizes: " + index + " (erster Index: 0)");
    System.out.println("Welcher Index soll entfernt werden?");
    System.out.print("Eingabe: ");
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    if (input >= menuOperation.getDrawing().getSize() || input < 0) {
      System.out.println("Unzulässiger Index gewählt");
    } else {
    menuOperation.getDrawing().remove(input);
    }

  }
  private void showDrawing(MenuOperation menuOperation) {
    System.out.println();
    System.out.println("Folgende Elemente sind in der Zeichnung vorhanden: ");
    if (menuOperation.getDrawing().getSize() == 0) {
      System.out.println();
      System.out.println("Es sind keine Elemente vorhanden.");
    } else {
      for (int i = 0; i < menuOperation.getDrawing().getSize(); i++) {
        System.out.print("Index " + i + ": ");
        System.out.println(menuOperation.getDrawing().getPrimitive(i));
      }
    }
  }
}