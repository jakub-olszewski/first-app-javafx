package eu.b24u.gra.elementy;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class Ludzik {
	/**
	 * Konstruktor to jest metoda,która konstruuje,tworzy,buduje ludzika
	 * 
	 * @param plotno
	 * @param punktRysowaniaLudzika
	 */
	public Ludzik(Plotno plotno, Punkt punktRysowaniaLudzika) {
		Color kolorNiebieski = Color.BLUE;
		Color colorTestowy = Color.RED;

		int promien = 50;

		plotno.rysujOkrag(punktRysowaniaLudzika, promien, kolorNiebieski);

		Punkt punktKoncaSzyji = new Punkt(248, 300);
		Punkt punktKoncaRekiLewej = new Punkt(187, 277);
		plotno.rysujLinie(punktRysowaniaLudzika, punktKoncaSzyji, kolorNiebieski);

		// Punkty testowe
		plotno.rysujOkrag(punktRysowaniaLudzika, 10, colorTestowy);
		plotno.rysujOkrag(punktKoncaSzyji, 10, colorTestowy);
		// ta linia ponizej rysuje kropke czerwona lewej reki
		plotno.rysujOkrag(punktKoncaRekiLewej, 10, colorTestowy);

		plotno.rysujLinie(punktKoncaSzyji, punktKoncaRekiLewej, kolorNiebieski);
	}

}
