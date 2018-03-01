package eu.b24u;

import eu.b24u.javafx.Aplikacja;
import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.Program;
import eu.b24u.javafx.Scena;

public class MojaAplikacja extends Aplikacja {


	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("x=" + x + " y=" + y);
		// plotno.czysc();

	}


	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Moja pierwsza aplikacja");
		scena.ustawRozmiar(500, 500);
		plotno.ustawRozmiar(500, 500);

		plotno.wstawObrazek(0, 150, "background.jpg");
		plotno.wypiszTekst(10, 10, "Witamy na zajeciach z programowania :)");
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujPunkt(x, y);
	}

}
