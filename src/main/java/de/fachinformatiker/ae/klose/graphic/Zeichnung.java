package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Ellipse;

import java.util.ArrayList;
import java.util.List;

public class Zeichnung implements Primitive{
  List<Primitive> feld = new ArrayList();

 public void add(Primitive primitive){
   feld.add(primitive);
 }

  public int getGroesse() {
    return feld.size();
  }

  public void entfernen(Primitive primitive){
   feld.remove(primitive);
  }

  public void entfernen(int index){
   feld.remove(index);
  }

  public Primitive getPrimitive(int index) {
   return feld.get(index);
  }

  public void rueckgaengig() {
   feld.remove(feld.size() - 1);
  }
}