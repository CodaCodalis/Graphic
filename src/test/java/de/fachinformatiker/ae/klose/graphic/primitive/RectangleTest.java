package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void constructorTest() {
    Vector start = new Vector(30, 40);
    int height = 10;
    int width = 20;

    assertEquals(30, start.getX());
    assertEquals(40, start.getY());
    assertEquals(10, height);
    assertEquals(20, width);
  }

  @Disabled
  @Test
  void defaultConstructorTest() {
    Rectangle rectangle = new Rectangle();

    assertEquals(40, rectangle.getStart().getX());
    assertEquals(30, rectangle.getStart().getY());
    assertEquals(20, rectangle.getHeight());
    assertEquals(10, rectangle.getWidth());
  }

  @Test
  void setterTest() {
    Rectangle rectangle = new Rectangle();
    Vector start = new Vector(100, 110);
    int height = 25;
    int width = 35;

    rectangle.setStart(start);
    rectangle.setHeight(height);
    rectangle.setWidth(width);

    assertEquals(100, rectangle.getStart().getX());
    assertEquals(110, rectangle.getStart().getY());
    assertEquals(25, rectangle.getHeight());
    assertEquals(35, rectangle.getWidth());
  }
}