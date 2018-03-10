package eu.b24u.javafx.element;

import java.awt.Point;

public class Punkt extends Point {

	public Punkt(int x, int y) {
		super(x, y);
	}

	public Punkt(double x, double y) {
		super((int) x, (int) y);
	}

}
