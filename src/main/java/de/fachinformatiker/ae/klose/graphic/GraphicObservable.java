package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Primitive;

public interface GraphicObservable {
  void addObserver(GraphicObserver graphicObserver);
  void removeObserver(GraphicObserver graphicObserver);
  void notifyObserver(String action, Primitive primitive);
}
