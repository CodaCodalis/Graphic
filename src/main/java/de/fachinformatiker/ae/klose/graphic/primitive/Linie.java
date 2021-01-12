package de.fachinformatiker.ae.klose.graphic.primitive;

public class Linie {

  private Punkt start;
  private Punkt ende;

  public Linie() {
    this.start = new Punkt(0, 0);
    this.ende = new Punkt(10, 10);
  }

  public Linie(Punkt start, Punkt ende) {
    this.start = start;
    this.ende = ende;

  }

  public Punkt getStart() {
    return start;
  }

  public void setStart(Punkt start) {
    this.start = start;
  }

  public Punkt getEnde() {
    return ende;
  }

  public void setEnde(Punkt ende) {
    this.ende = ende;
  }
}