package de.fachinformatiker.ae.klose.graphic.primitive;

import java.io.Serializable;

public class Rectangle implements Primitive, Serializable {

  private static final long serialVersionUID = -1846822941125747180L;
  Vector start;
  int height;
  int width;

  public Rectangle(){
    //this.start = new Vector(40,30);
    //this.height = 20;
    //this.width = 10;
  }

  public Rectangle(Vector mitte, int height, int width) {
    this.start = mitte;
    this.height = height;
    this.width = width;
  }

  public Vector getStart() {
    return start;
  }

  public void setStart(Vector start) {
    this.start = start;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String toString() {
    return "Rechteck (Startpunkt, Höhe, Breite): " + start + ", " + height + ", " + width;
  }
}
