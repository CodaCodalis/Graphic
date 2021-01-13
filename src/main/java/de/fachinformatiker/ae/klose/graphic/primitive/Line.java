package de.fachinformatiker.ae.klose.graphic.primitive;

public class Line {

  private Vector start;
  private Vector end;

  public Line() {
    this.start = new Vector(0, 0);
    this.end = new Vector(10, 10);
  }

  public Line(Vector start, Vector end) {
    this.start = start;
    this.end = end;

  }

  public Vector getStart() {
    return start;
  }

  public void setStart(Vector start) {
    this.start = start;
  }

  public Vector getEnd() {
    return end;
  }

  public void setEnd(Vector end) {
    this.end = end;
  }
}