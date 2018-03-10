package eu.b24u;


import eu.b24u.javafx.Aplikacja;
import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.Program;
import eu.b24u.javafx.Scena;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class MojaAplikacja extends Aplikacja {


	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("x=" + x + " y=" + y);
		// plotno.czysc();
		Punkt punkt = new Punkt(x, y);
		plotno.rysujOkrag(punkt, 50, Color.BLUE);
	}


	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Moja pierwsza aplikacja");
		scena.ustawRozmiar(500, 500);
		plotno.ustawRozmiar(500, 500);

		plotno.wstawObrazek(0, 150, "background.jpg");
		// to jest komentarz
		// typZmiennej nazwaZmiennej = wartość;
		String imie = "Aga ";
		int wiek = 12;
		plotno.wypiszTekst(50, 100, "Witamy na zajeciach z programowania :)");
		plotno.wypiszTekst(50, 120, imie + wiek);
		Program.wypisz("hej");
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujPunkt(x, y);
	}

}
