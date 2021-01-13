package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VectorTest {
  @Test
  void constructorTest() {
    Vector p = new Vector(5, 4);

    Assertions.assertEquals(5.0, p.getX());
    Assertions.assertEquals(4.0, p.getY());
  }

  @Test
  void defaultConstructorTest() {
    Vector p = new Vector();

    Assertions.assertEquals(0, p.getX());
    Assertions.assertEquals(0, p.getY());
  }

  @Test
  void setterTest() {
    Vector p = new Vector();
    p.setX(5);
    p.setY(4);

    Assertions.assertEquals(5.0,p.getX());
    Assertions.assertEquals(4.0,p.getY());
  }
}