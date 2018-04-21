package eu.b24u.javafx.gra.kolkoikrzyzyk;


import eu.b24u.javafx.Aplikacja;
import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.Program;
import eu.b24u.javafx.Scena;

public class KolkoIKrzyzykAplikacja extends Aplikacja {

	KolkoIKrzyzykEngine silnikGry;

	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("Punkt punkt = new Punkt(" + (int) x + " ," + (int) y + ");");
		// plotno.czysc();
		// Punkt punkt = new Punkt(x, y);
		// plotno.rysujOkrag(punkt, 20, Color.ORANGE);
	}


	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Moja pierwsza aplikacja");
		scena.ustawRozmiar(500, 500);
		plotno.ustawRozmiar(500, 500);
		silnikGry = new KolkoIKrzyzykEngineImpl();

		silnikGry.rysujPlansze(plotno);
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujPunkt(x, y);
	}

}
