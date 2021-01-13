# Lehrprojekt _**Graphic**_ zur Einführung in OOP

## Referenzen

Standardwerke für die Javaentwicklung
- [Java ist auch eine Insel](https://amzn.to/3bBG7vt) ([Web-Version](http://openbook.rheinwerk-verlag.de/javainsel/))
- [Effective Java](https://amzn.to/2XyfEH4) ([Deutsche Ausgabe](https://amzn.to/38Dr6HK))
- [Clean Code](https://amzn.to/2P85FVA) ([Deutsche Ausgabe](https://amzn.to/2Xzdnvp))
- [Design Pattern](https://amzn.to/2LjTqGv) der Gang of four ([Deutsche Ausgabe](https://amzn.to/2XB0UqT))

Dokumentation
- [Git Anwendungshandbuch](https://git-scm.com/book/de/v2)
- [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
- [Studienprojekt Design Pattern](https://www.philipphauer.de/study/se/design-pattern.php)

## Tag 0

Wiederholung:
	Klassen, Vererbung, Konstruktoren, Member, Getter/Setter, Membermethoden
	Collection, List, Map
	JUnit
	Maven

Aufgabenstellung:
	Was sind Design Pattern?
	Wozu benötige ich Design Pattern?
	Klassifikation von Design Patterns
	Auseinandersetzung mit MVC (im Kontext der Desktopentwicklung)
	Auseinandersetzung mit Observer- und State-Pattern

Materialien:

- [Design Pattern (GoF](https://de.wikipedia.org/wiki/Entwurfsmuster_(Buch))
- [Studienprojekt Design Pattern](https://www.philipphauer.de/study/se/design-pattern.php)

Ergebnisse:
	mit den Themen der Aufgabenstellung auseinandergesetzt
	ein Projekt "Graphic" erstellt und nach Github gepusht    

## Tag 1

Aufgabenstellung:
	Entwurf einer Klassenstruktur für primitive Grafikelemente (Punkt, Linie, Ellipse und Rechteck)
	Entsprechende Member und Zugriffsmethoden entwickeln
	Entwurf einer Klasse, die Instanzen dieser Primitiven zu einer Zeichnung zusammenfasst, inklusive Member und Methoden
	Schreiben von Tests, um sicherzustellen, dass die Methoden der entworfenen Klassen wie vorgesehen arbeiten

Materialien:
	keine

Ergebnisse:
	Klassen (Vector, Line, Oval, Rectangular, Drawing) in IntelliJ angelegt
	Interface Primitive angelegt)
	Vector: zwei Membervariablen (int x, int y) angelegt
	Line: zwei Membervariablen (Vector start, Vector end) angelegt
	Oval: drei Membervariablen angelegt (Vector center, int height, int width)
	Rectangle: drei Membervariablen (Vector start, int height, int width) angelegt
	Interface Primitive angelegt
	Klassen mittels 'implemente Primitive' erweitert
	Drawing: ArrayList 'primitives' erstellt, sechs Methoden (add(Primitive primitive), getSize(), remove(Primitive primitive), remove(int index), getPrimitive(int index), undo() erstellt
	mittels Alt+Einf Konstruktor, Getter und Setter erstellt
	Interface (Primitive) angelegt

## Tag 2
Wiederholung:
	Besprechung und Diskussion der Aufgabenstellung und Ergebnisse des Vortages

Aufgabenstellung:
	Versionsverwaltung Git verwenden, um Projekte zu klonen
 	Design Pattern 'Observer Pattern' im Projekt implementieren

Materialien:
    - [Git Anwendungshandbuch](https://git-scm.com/book/de/v2)
    - [JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)
    - [Design Pattern](https://amzn.to/2LjTqGv) der Gang of four ([Deutsche Ausgabe](https://amzn.to/2XB0UqT))

Ergebnisse:
	Interfaces Observer und Observable angelegt
	Observer: eine Methode update() angelegt
	Observable: drei Methoden (addObserver(Observer observer), removeObserver(Observer observer), notifyObserver()) angelegt
	...


