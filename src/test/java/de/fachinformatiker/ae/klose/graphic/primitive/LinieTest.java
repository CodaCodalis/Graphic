package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinieTest {
  @Test
  void constructorTest() {
    Punkt pStart = new Punkt(3, 4);
    Punkt pEnde = new Punkt(5, 9);
    Linie linie = new Linie(pStart, pEnde);
    assertEquals(3, linie.getStart().getX());
    assertEquals(4, linie.getStart().getY());
    assertEquals(5, linie.getEnde().getX());
    assertEquals(9, linie.getEnde().getY());
  }

  @Test
  void defaultConstructorTest() {
    Linie linie = new Linie();
    assertEquals(0, linie.getStart().getX());
    assertEquals(0, linie.getStart().getY());
    assertEquals(10, linie.getEnde().getX());
    assertEquals(10, linie.getEnde().getY());
  }

  @Test
  void setterTest() {
    Linie linie = new Linie();
    Punkt start = new Punkt(0,1);
    Punkt ende = new Punkt(2,3);
    linie.setStart(start);
    linie.setEnde(ende);
    assertEquals(0, linie.getStart().getX());
    assertEquals(1, linie.getStart().getY());
    assertEquals(2, linie.getEnde().getX());
    assertEquals(3, linie.getEnde().getY());
  }
}