package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

public interface MenuState {
  void showMenu();
  MenuState processMenu(Drawing drawing);
}
