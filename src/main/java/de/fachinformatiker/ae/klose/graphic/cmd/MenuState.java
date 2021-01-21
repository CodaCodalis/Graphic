package de.fachinformatiker.ae.klose.graphic.cmd;

public interface MenuState {
  void showMenu();
  MenuState processMenu(MenuOperation menuOperation);
}
