package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EllipseTest {
  @Test
  void constructorTest() {
    Punkt mitte = new Punkt(30, 40);
    int hoehe = 10;
    int breite = 20;
    assertEquals(30, mitte.getX());
    assertEquals(40, mitte.getY());
    assertEquals(10, hoehe);
    assertEquals(20, breite);
  }

  @Test
  void defaultConstructorTest() {
    Ellipse e = new Ellipse();
    assertEquals(40, e.getMitte().getX());
    assertEquals(30, e.getMitte().getY());
    assertEquals(20, e.getHoehe());
    assertEquals(10, e.getBreite());
  }

  @Test
  void setterTest() {
    Ellipse e = new Ellipse();
    Punkt mitte = new Punkt(100, 110);
    int hoehe = 25;
    int breite = 35;
    e.setMitte(mitte);
    e.setHoehe(hoehe);
    e.setBreite(breite);
    assertEquals(100, e.getMitte().getX());
    assertEquals(110, e.getMitte().getY());
    assertEquals(25, e.getHoehe());
    assertEquals(35, e.getBreite());
  }
}

