package eu.b24u.javafx.element;

import eu.b24u.javafx.Oblicz;

public class Okrag {

	Punkt srodek;
	double promien;

	public Okrag(Punkt srodek, double promien) {
		this.srodek = srodek;
		this.promien = promien;
	}

	public boolean zawieraPunkt(Punkt punktDoSprawdzenia) {
		double odleglosc = Oblicz.odlegloscPomiedzyDwomaPunktami(punktDoSprawdzenia, srodek);
		return odleglosc <= promien;
	}

}
