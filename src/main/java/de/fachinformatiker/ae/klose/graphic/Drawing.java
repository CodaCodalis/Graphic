package de.fachinformatiker.ae.klose.graphic;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Primitive, Observable{
  List<Primitive> primitives = new ArrayList();
  List<Observer> observers = new ArrayList();

 public void add(Primitive primitive){
   this.primitives.add(primitive);
   notifyObserver();
 }

  public int getSize() {
    return primitives.size();
  }

  public void remove(Primitive primitive){
   this.primitives.remove(primitive);
   notifyObserver();
  }

  public void remove(int index){
   primitives.remove(index);
   notifyObserver();
  }

  public Primitive getPrimitive(int index) {
   return primitives.get(index);
  }

  public void undo() {
   primitives.remove(primitives.size() - 1);
   notifyObserver();
  }

 @Override
 public void addObserver(Observer observer) {
  observers.add(observer);
 }

 @Override
 public void removeObserver(Observer observer) {
  observers.remove(observer);
 }

 @Override
 public void notifyObserver() {
  for (int i = 0 ; i < observers.size(); i++) {
   observers.get(i).update();
  }
 }
}