package eu.b24u.gra.elementy;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class Chmurka {
	private boolean czyTestujemy;

	/**
	 * Konstruktor to jest metoda,która konstruuje,tworzy,buduje ludzika
	 * 
	 * @param plotno
	 * @param punktRysowaniaLudzika
	 */
	public Chmurka(Plotno plotno, Punkt punktRysowaniaLudzika, boolean czyTestujemy) {
		Color kolorNiebieski = Color.BLUE;
		Color colorTestowy = Color.RED;
		double x = punktRysowaniaLudzika.x;
		double y = punktRysowaniaLudzika.y;
		this.czyTestujemy = czyTestujemy;

		int promien = 50;

		// male kolko
		plotno.rysujOkrag(x, y, promien / 2);

		// wieksze kolko
		plotno.rysujOkrag(x + 20, y - 20, promien);

	}

	/**
	 * Tworzenie punktu na plotnie i rysuje testowo czerwona kropke
	 * 
	 * @param x
	 *            wspolrzedna pozioma
	 * @param y
	 *            wspolrzedna pionowa
	 * @param plotno
	 *            miejsce na ktorym rysujemy
	 * @return punkt
	 */
	private Punkt stworzPunkt(double x, double y, Plotno plotno) {
		Punkt stworzonyPunkt = new Punkt(x, y);
		if (czyTestujemy) {
			Color colorTestowy = Color.RED;
			plotno.rysujOkrag(stworzonyPunkt, 10, colorTestowy);
		}

		return stworzonyPunkt;
	}

}
