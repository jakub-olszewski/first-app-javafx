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
		Punkt punktKoncaSzyji = stworzPunkt(x, y + 50, plotno);
		Punkt punktKoncaRekiLewej = stworzPunkt(x - 50, y + 20, plotno);
		plotno.rysujLinie(punktRysowaniaLudzika, punktKoncaSzyji, kolorNiebieski);

		// Punkty testowe
		// plotno.rysujOkrag(punktRysowaniaLudzika, 10, colorTestowy);
		// plotno.rysujOkrag(punktKoncaSzyji, 10, colorTestowy);
		// ta linia ponizej rysuje kropke czerwona lewej reki
		// plotno.rysujOkrag(punktKoncaRekiLewej, 10, colorTestowy);

		plotno.rysujLinie(punktKoncaSzyji, punktKoncaRekiLewej, kolorNiebieski);
	}

	private Punkt stworzPunkt(double x, double y, Plotno plotno) {
		Punkt stworzonyPunkt = new Punkt(x, y);
		if (czyTestujemy) {
			Color colorTestowy = Color.RED;
			plotno.rysujOkrag(stworzonyPunkt, 10, colorTestowy);
		}

		return stworzonyPunkt;
	}

}
