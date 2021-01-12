package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PunktTest {
  @Test
  void constructorTest() {
    Punkt p = new Punkt(5, 4);
    Assertions.assertEquals(5.0, p.getX());
    Assertions.assertEquals(4.0, p.getY());
  }

  @Test
  void defaultConstructorTest() {
    Punkt p = new Punkt();
    Assertions.assertEquals(0, p.getX());
    Assertions.assertEquals(0, p.getY());
  }

  @Test
  void setterTest() {
    Punkt p = new Punkt();
    p.setX(5);
    p.setY(4);
    Assertions.assertEquals(5.0,p.getX());
    Assertions.assertEquals(4.0,p.getY());
  }
}