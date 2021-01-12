package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RechteckTest {
  @Test
  void constructorTest() {
    Punkt start = new Punkt(30, 40);
    int hoehe = 10;
    int breite = 20;
    assertEquals(30, start.getX());
    assertEquals(40, start.getY());
    assertEquals(10, hoehe);
    assertEquals(20, breite);
  }

  @Test
  void defaultConstructorTest() {
    Rechteck r = new Rechteck();
    assertEquals(40, r.getStart().getX());
    assertEquals(30, r.getStart().getY());
    assertEquals(20, r.getHoehe());
    assertEquals(10, r.getBreite());
  }

  @Test
  void setterTest() {
    Rechteck r = new Rechteck();
    Punkt start = new Punkt(100, 110);
    int hoehe = 25;
    int breite = 35;
    r.setStart(start);
    r.setHoehe(hoehe);
    r.setBreite(breite);
    assertEquals(100, r.getStart().getX());
    assertEquals(110, r.getStart().getY());
    assertEquals(25, r.getHoehe());
    assertEquals(35, r.getBreite());
  }
}