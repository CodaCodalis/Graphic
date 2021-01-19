package de.fachinformatiker.ae.klose.graphic.primitive;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OvalTest {
  @Test
  void constructorTest() {

    Vector center = new Vector(30, 40);
    int height = 10;
    int width = 20;

    assertEquals(30, center.getX());
    assertEquals(40, center.getY());
    assertEquals(10, height);
    assertEquals(20, width);
  }

  @Disabled
  @Test
  void defaultConstructorTest() {

    Oval oval = new Oval();

    assertEquals(40, oval.getCenter().getX());
    assertEquals(30, oval.getCenter().getY());
    assertEquals(20, oval.getHeight());
    assertEquals(10, oval.getWidth());
  }

  @Test
  void setterTest() {
    Oval oval = new Oval();
    Vector center = new Vector(100, 110);
    int height = 25;
    int width = 35;

    oval.setCenter(center);
    oval.setHeight(height);
    oval.setWidth(width);

    assertEquals(100, oval.getCenter().getX());
    assertEquals(110, oval.getCenter().getY());
    assertEquals(25, oval.getHeight());
    assertEquals(35, oval.getWidth());
  }
}

