package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Primitive;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Drawing implements Primitive, GraphicObservable, Serializable {
  List<Primitive> primitives = new ArrayList();
  List<GraphicObserver> graphicObservers = new ArrayList();

  public void add(Primitive primitive) {
    this.primitives.add(primitive);
    notifyObserver("add", primitive);
  }

  public int getSize() {
    return primitives.size();
  }

  public void remove(Primitive primitive) {
    this.primitives.remove(primitive);
    notifyObserver("remove", primitive);
  }

  public void remove(int index) {
    Primitive primitive = getPrimitive(index);
    primitives.remove(index);
    notifyObserver("remove", primitive);
  }

  public Primitive getPrimitive(int index) {
    return primitives.get(index);
  }

  public void undo() {
    primitives.remove(primitives.size() - 1);
    notifyObserver("undo", getPrimitive(primitives.size() - 1));
  }

  @Override
  public void addObserver(GraphicObserver graphicObserver) {
    graphicObservers.add(graphicObserver);
  }

  @Override
  public void removeObserver(GraphicObserver graphicObserver) {
    graphicObservers.remove(graphicObserver);
  }

  @Override
  public void notifyObserver(String action, Primitive primitive) {
    for (int i = 0; i < graphicObservers.size(); i++) {
      graphicObservers.get(i).update(this, action, primitive);
    }
  }
}