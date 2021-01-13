package de.fachinformatiker.ae.klose.graphic;

public interface Observable {
  void addObserver(Observer observer);
  void removeObserver(Observer observer);
  void notifyObserver();
}
