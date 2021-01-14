package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Primitive;

public interface GraphicObserver {
  void update(GraphicObservable graphicObservable, String action, Primitive primitive);
}
