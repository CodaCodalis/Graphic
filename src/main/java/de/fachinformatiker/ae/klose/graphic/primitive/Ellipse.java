package de.fachinformatiker.ae.klose.graphic.primitive;

import de.fachinformatiker.ae.klose.graphic.Primitive;

public class Ellipse implements Primitive {

  private Punkt mitte;
  private int hoehe;
  private int breite;

  public Ellipse(){
    this.mitte = new Punkt (40,30);
    this.hoehe = 20;
    this.breite = 10;
  }

  public Ellipse(Punkt mitte, int hoehe, int breite) {
    this.mitte = mitte;
    this.hoehe = hoehe;
    this.breite = breite;
  }

  public Punkt getMitte() {
    return mitte;
  }

  public void setMitte(Punkt mitte) {
    this.mitte = mitte;
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
