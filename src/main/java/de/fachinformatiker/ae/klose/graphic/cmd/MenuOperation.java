package de.fachinformatiker.ae.klose.graphic.cmd;

import de.fachinformatiker.ae.klose.graphic.Drawing;

public interface MenuOperation {

  Drawing getDrawing();
  void saveDrawing(String filename);
  void loadDrawing(String filename);


}
