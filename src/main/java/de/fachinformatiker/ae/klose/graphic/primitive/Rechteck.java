package de.fachinformatiker.ae.klose.graphic.primitive;

import de.fachinformatiker.ae.klose.graphic.Primitive;

public class Rechteck implements Primitive {

  Punkt start;
  int hoehe;
  int breite;

  public Rechteck(){
    this.start = new Punkt(40,30);
    this.hoehe = 20;
    this.breite = 10;
  }

  public Rechteck(Punkt mitte, int hoehe, int breite) {
    this.start = mitte;
    this.hoehe = hoehe;
    this.breite = breite;
  }

  public Punkt getStart() {
    return start;
  }

  public void setStart(Punkt start) {
    this.start = start;
  }

  public int getHoehe() {
    return hoehe;
  }

  public void setHoehe(int hoehe) {
    this.hoehe = hoehe;
  }

  public int getBreite() {
    return breite;
  }

  public void setBreite(int breite) {
    this.breite = breite;
  }
}
