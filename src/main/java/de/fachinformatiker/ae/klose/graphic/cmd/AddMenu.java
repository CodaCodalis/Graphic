package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;
import de.fachinformatiker.ae.klose.graphic.primitive.*;

import java.util.Scanner;

public class AddMenu implements MenuState {
  @Override
  public void showMenu() {
    System.out.println("(1) Punkt");
    System.out.println("(2) Linie");
    System.out.println("(3) Ellipse");
    System.out.println("(4) Rechteck");
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
        case "1": Vector vector = new Vector();
                  addVector(vector);
                  drawing.add(vector);
                  state = new AddMenu();
                  exit = true;
          break;
        case "2": Line line = new Line();
                  addLine(line);
                  drawing.add(line);
                  state = new AddMenu();
                  exit = true;
          break;
        case "3": Oval oval = new Oval();
                  addOval(oval);
                  drawing.add(oval);
                  state = new AddMenu();
                  exit = true;
          break;
        case "4": Rectangle rectangle = new Rectangle();
                  addRectangle(rectangle);
                  drawing.add(rectangle);
                  state = new AddMenu();
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

  private Rectangle addRectangle(Rectangle rectangle) {
    Vector start = new Vector();

    Scanner scanner = new Scanner(System.in);

    System.out.println("X-Koordinate des Startpunkts eingeben: ");
    int xCoordinateStart = scanner.nextInt();
    start.setX(xCoordinateStart);

    System.out.println("Y-Koordinate des Startpunkts eingeben: ");
    int yCoordinateStart = scanner.nextInt();
    start.setY(yCoordinateStart);

    rectangle.setStart(start);

    System.out.println("Höhe eingeben: ");
    int height = scanner.nextInt();
    rectangle.setHeight(height);

    System.out.println("Breite eingeben: ");
    int width = scanner.nextInt();
    rectangle.setWidth(width);

    return rectangle;
  }

  private Oval addOval(Oval oval) {
    Vector center = new Vector();

    Scanner scanner = new Scanner(System.in);

    System.out.println("X-Koordinate des Mittelpunkts eingeben: ");
    int xCoordinateStart = scanner.nextInt();
    center.setX(xCoordinateStart);

    System.out.println("Y-Koordinate des Mittelpunkts eingeben: ");
    int yCoordinateStart = scanner.nextInt();
    center.setY(yCoordinateStart);

    oval.setCenter(center);

    System.out.println("Höhe eingeben: ");
    int height = scanner.nextInt();
    oval.setHeight(height);

    System.out.println("Breite eingeben: ");
    int width = scanner.nextInt();
    oval.setWidth(width);

    return oval;
  }

  private Line addLine(Line line) {
    Vector start = new Vector();
    Vector end = new Vector();

    Scanner scanner = new Scanner(System.in);

    System.out.println("X-Koordinate des Startpunkts eingeben: ");
    int xCoordinateStart = scanner.nextInt();
    start.setX(xCoordinateStart);

    System.out.println("Y-Koordinate des Startpunkts eingeben: ");
    int yCoordinateStart = scanner.nextInt();
    start.setY(yCoordinateStart);

    line.setStart(start);

    System.out.println("X-Koordinate des Endpunkts eingeben: ");
    int xCoordinateEnd = scanner.nextInt();
    end.setX(xCoordinateEnd);

    System.out.println("Y-Koordinate des Endpunkts eingeben: ");
    int yCoordinateEnd = scanner.nextInt();
    end.setY(yCoordinateEnd);

    line.setEnd(end);

    return line;
  }

  private Vector addVector(Vector vector) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("X-Koordinate eingeben: ");
    int xCoordinate = scanner.nextInt();
    vector.setX(xCoordinate);

    System.out.println("Y-Koordinate eingeben: ");
    int yCoordinate = scanner.nextInt();
    vector.setY(yCoordinate);

    return vector;
  }
}
