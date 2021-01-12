package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Ellipse;
import de.fachinformatiker.ae.klose.graphic.primitive.Punkt;
import de.fachinformatiker.ae.klose.graphic.primitive.Rechteck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZeichnungTest {

  @Test
  void addTest() {
    Zeichnung feld = new Zeichnung();
    Punkt p = new Punkt();
    Ellipse e = new Ellipse();
    Rechteck r = new Rechteck();

    feld.add(p);
    feld.add(e);
    feld.add(r);

    int groesse = feld.getGroesse();

    assertEquals(3, groesse);
  }

  @Test
  void testFeldEntfernen() {
    Zeichnung feld = new Zeichnung();
    Punkt p = new Punkt();
    Ellipse e = new Ellipse();
    Rechteck r = new Rechteck();

    feld.add(p);
    feld.add(e);
    feld.add(r);

    feld.entfernen(1);
    feld.entfernen(p);

    int groesse = feld.getGroesse();

    assertEquals(1, groesse);
  }

  @Test
  void testGetFeld(){
    Zeichnung feld = new Zeichnung();

    Punkt p = new Punkt();
    Ellipse e = new Ellipse();
    Rechteck r = new Rechteck();

    feld.add(p);
    feld.add(e);
    feld.add(r);

    assertEquals(e, feld.getPrimitive(1));
  }

  @Test
  void testRueckgaengig() {
    Zeichnung feld = new Zeichnung();

    Punkt p = new Punkt();
    Ellipse e = new Ellipse();
    Rechteck r = new Rechteck();

    feld.add(p);
    feld.add(e);
    feld.add(r);

    feld.rueckgaengig();

    int groesse = feld.getGroesse();

    assertEquals(2, groesse);

  }
}