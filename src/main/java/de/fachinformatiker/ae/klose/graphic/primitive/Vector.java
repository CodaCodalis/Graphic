package de.fachinformatiker.ae.klose.graphic.primitive;

public class Vector implements Primitive {

  private int x;
  private int y;

  public Vector(){

  }

  public Vector(int x, int y) {
    setX(x);
    setY(y);
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public String toString() {
    return "Vector (x, y): " + "(" + x + ", " + y + ")";
  }
}