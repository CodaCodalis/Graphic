package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Oval;
import de.fachinformatiker.ae.klose.graphic.primitive.Primitive;
import de.fachinformatiker.ae.klose.graphic.primitive.Vector;
import de.fachinformatiker.ae.klose.graphic.primitive.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrawingTest {

  @Test
  void addTest() {
    Drawing drawing = new Drawing();
    Vector vector = new Vector();
    Oval oval = new Oval();
    Rectangle rectangle = new Rectangle();

    drawing.add(vector);
    drawing.add(oval);
    drawing.add(rectangle);

    int size = drawing.getSize();

    assertEquals(3, size);
  }

  @Test
  void testRemoveDrawing() {
    Drawing drawing = new Drawing();
    Vector vector = new Vector();
    Oval oval = new Oval();
    Rectangle rectangle = new Rectangle();

    drawing.add(vector);
    drawing.add(oval);
    drawing.add(rectangle);

    drawing.remove(1);
    drawing.remove(vector);

    int size = drawing.getSize();

    assertEquals(1, size);
  }

  @Test
  void testGetDrawing(){
    Drawing drawing = new Drawing();

    Vector vector = new Vector();
    Oval oval = new Oval();
    Rectangle rectangle = new Rectangle();

    drawing.add(vector);
    drawing.add(oval);
    drawing.add(rectangle);

    assertEquals(oval, drawing.getPrimitive(1));
  }

  @Test
  void testUndo() {
    Drawing drawing = new Drawing();

    Vector vector = new Vector();
    Oval oval = new Oval();
    Rectangle rectangle = new Rectangle();

    drawing.add(vector);
    drawing.add(oval);
    drawing.add(rectangle);

    drawing.undo();

    int size = drawing.getSize();

    assertEquals(2, size);

  }

  @Test
  void testObservable() {

    int [] counter = {0, 0};

    GraphicObserver graphicObserver = new GraphicObserver() {
      @Override
      public void update(GraphicObservable observable, String action, Primitive primitive) {
        counter[0]++;
      }
    };

    GraphicObserver graphicObserver2 = new GraphicObserver() {
      @Override
      public void update(GraphicObservable observable, String action, Primitive primitive) {
        if (action.equals("add")) {
          counter[1]++;

        } else if (action.equals("remove")) {
          counter[1]--;

        } else if (action.equals("undo")) {
          counter[1]--;

        }
      }
    };

    Drawing drawing = new Drawing();

    drawing.addObserver(graphicObserver);
    drawing.addObserver(graphicObserver2);

    Vector vector = new Vector();
    Oval oval = new Oval();
    Rectangle rectangle = new Rectangle();

    drawing.add(vector);
    drawing.add(oval);
    drawing.add(rectangle);
    drawing.remove(oval);

    assertEquals(4, counter[0]);
    assertEquals(2, counter[1]);

    drawing.removeObserver(graphicObserver);
    drawing.add(vector);

    assertEquals(4, counter[0]);
    assertEquals(3, counter[1]);
  }
}