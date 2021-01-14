package de.fachinformatiker.ae.klose.graphic.primitive;

public class Rectangle implements Primitive {

  Vector start;
  int height;
  int width;

  public Rectangle(){
    this.start = new Vector(40,30);
    this.height = 20;
    this.width = 10;
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
}
