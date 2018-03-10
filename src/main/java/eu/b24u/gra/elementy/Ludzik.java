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
		Color color = Color.BLUE;
		Color colorTestowy = Color.RED;

		int promien = 50;

		plotno.rysujOkrag(punktRysowaniaLudzika, promien, color);

		Punkt koniecSzyji = new Punkt(300, 300);

		plotno.rysujLinie(punktRysowaniaLudzika, koniecSzyji, color);

		// Punkty testowe
		plotno.rysujOkrag(punktRysowaniaLudzika, 10, colorTestowy);
		plotno.rysujOkrag(koniecSzyji, 10, colorTestowy);


	}

}
