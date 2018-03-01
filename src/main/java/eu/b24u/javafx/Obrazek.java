package eu.b24u.javafx;

import javafx.scene.image.Image;

public class Obrazek {

	public static Image pobierz(String nazwaObrazka) {
		return new Image(Obrazek.class.getResourceAsStream("/" + nazwaObrazka));
	}

}
