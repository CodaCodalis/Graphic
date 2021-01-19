package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VectorTest {
  @Test
  void constructorTest() {
    Vector vector = new Vector(5, 4);

    Assertions.assertEquals(5.0, vector.getX());
    Assertions.assertEquals(4.0, vector.getY());
  }

  @Test
  void defaultConstructorTest() {
    Vector vector = new Vector();

    Assertions.assertEquals(0, vector.getX());
    Assertions.assertEquals(0, vector.getY());
  }

  @Test
  void setterTest() {
    Vector vector = new Vector();
    vector.setX(5);
    vector.setY(4);

    Assertions.assertEquals(5.0,vector.getX());
    Assertions.assertEquals(4.0,vector.getY());
  }
}