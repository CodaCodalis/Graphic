package de.fachinformatiker.ae.klose.graphic;

import de.fachinformatiker.ae.klose.graphic.primitive.Oval;
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
  void testFeldEntfernen() {
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
  void testGetFeld(){
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
    int [] counter = {0};
    Observer observer = new Observer() {
      @Override
      public void update() {
        counter[0]++;
      }
    };
    Drawing drawing = new Drawing();
    drawing.addObserver(observer);

    Vector vector = new Vector();
    Oval oval = new Oval();
    Rectangle rectangle = new Rectangle();

    drawing.add(vector);
    drawing.add(oval);
    drawing.add(rectangle);
    drawing.remove(oval);

    assertEquals(4, counter[0]);

    drawing.removeObserver(observer);

    drawing.add(vector);

    assertEquals(4, counter[0]);
  }
}