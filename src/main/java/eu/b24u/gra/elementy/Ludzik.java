package eu.b24u.gra.elementy;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class Ludzik {
	private boolean czyTestujemy;

	/**
	 * Konstruktor to jest metoda,która konstruuje,tworzy,buduje ludzika
	 * 
	 * @param plotno
	 * @param punktRysowaniaLudzika
	 */
	public Ludzik(Plotno plotno, Punkt punktRysowaniaLudzika, boolean czyTestujemy) {
		Color kolorNiebieski = Color.BLUE;
		Color colorTestowy = Color.RED;
		double x = punktRysowaniaLudzika.x;
		double y = punktRysowaniaLudzika.y;
		this.czyTestujemy = czyTestujemy;

		int promien = 50;

		// TODO 1 Dodanie przelacznika do testow
		// TODO 2 Zrobienie jednej metody do tworzenia punktu i rysowania punktu
		// testowego jesli przelacznik jest prawda (true)
		// TODO 3 Dodanie do ludzika metody przywitajSie() ( ludzik podnosi reke )
		// TODO 4 Dodanie do metody przywitajSie()
		plotno.rysujOkrag(punktRysowaniaLudzika, promien, kolorNiebieski);

		// Punkt punktKoncaSzyji = new Punkt(x, y + 50);
		Punkt punktKoncaSzyji = stworzPunkt(x + 0, y + 50, plotno);
		Punkt punktKoncaRekiLewej = stworzPunkt(x - 50, y + 20, plotno);
		plotno.rysujLinie(punktRysowaniaLudzika, punktKoncaSzyji, kolorNiebieski);

		Color color;
		Punkt punktKoniecPrawejReki = stworzPunkt(x + 50, y + 20, plotno);
		// TODO 5 Rysuj prawa reke
		plotno.rysujLinie(punktKoncaSzyji, punktKoniecPrawejReki, kolorNiebieski);
		Punkt punktKoniecTulowia = stworzPunkt(x, y + 103, plotno);
		plotno.rysujLinie(punktKoncaSzyji, punktKoniecTulowia, kolorNiebieski);

		// TODO 6 Rysuj tulow
		// TODO 7 Rysuj prawa noge
		// TODO 8 Rysuj lewa noge

		plotno.rysujLinie(punktKoncaSzyji, punktKoncaRekiLewej, kolorNiebieski);
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
