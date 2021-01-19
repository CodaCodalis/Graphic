package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineTest {
  @Test
  void constructorTest() {
    Vector pStart = new Vector(3, 4);
    Vector pEnd = new Vector(5, 9);
    Line line = new Line(pStart, pEnd);
    assertEquals(3, line.getStart().getX());
    assertEquals(4, line.getStart().getY());
    assertEquals(5, line.getEnd().getX());
    assertEquals(9, line.getEnd().getY());
  }

  @Disabled
  @Test
  void defaultConstructorTest() {
    Line line = new Line();
    assertEquals(0, line.getStart().getX());
    assertEquals(0, line.getStart().getY());
    assertEquals(10, line.getEnd().getX());
    assertEquals(10, line.getEnd().getY());
  }

  @Test
  void setterTest() {
    Line line = new Line();
    Vector start = new Vector(0,1);
    Vector end = new Vector(2,3);
    line.setStart(start);
    line.setEnd(end);
    assertEquals(0, line.getStart().getX());
    assertEquals(1, line.getStart().getY());
    assertEquals(2, line.getEnd().getX());
    assertEquals(3, line.getEnd().getY());
  }
}