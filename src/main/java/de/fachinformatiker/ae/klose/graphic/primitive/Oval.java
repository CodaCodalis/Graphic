package de.fachinformatiker.ae.klose.graphic.primitive;

import java.io.Serializable;

public class Oval implements Primitive, Serializable {

  private static final long serialVersionUID = -3762012035304759136L;
  private Vector center;
  private int height;
  private int width;

  public Oval(){
    //this.center = new Vector(40,30);
    //this.height = 20;
    //this.width = 10;
  }

  public Oval(Vector center, int height, int width) {
    this.center = center;
    this.height = height;
    this.width = width;
  }

  public Vector getCenter() {
    return center;
  }

  public void setCenter(Vector center) {
    this.center = center;
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
    return "Oval (Mittelpunkt, Höhe, Breite): " + center + ", " + height + ", " + width;
  }
}
