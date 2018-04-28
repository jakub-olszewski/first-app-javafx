package eu.b24u.javafx.gra.kolkoikrzyzyk;

import eu.b24u.javafx.Aplikacja;
import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.Program;
import eu.b24u.javafx.Scena;
import eu.b24u.javafx.element.Punkt;

public class KolkoIKrzyzykAplikacja extends Aplikacja {

	KolkoIKrzyzykEngine silnikGry;
	private boolean warunekCzyKrzyzyk;

	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("Punkt punkt = new Punkt(" + (int) x + " ," + (int) y + ");");
		Punkt punkt = new Punkt(x, y);
		if (warunekCzyKrzyzyk) {
			// ten kod wykonuje sie jesli warunekCzyKrzyzyk jest prawda-true
			silnikGry.rysujKrzyzyk(punkt, plotno);
			warunekCzyKrzyzyk = false;
		} else {
			// ten kod wykonuje sie jesli warunekCzyKrzyzyk jest fałszem-false
			silnikGry.rysujKolko(punkt, plotno);
			warunekCzyKrzyzyk = true;
		}
		// silnikGry.rysujKrzyzyk(punkt, plotno);
		// silnikGry.rysujKolko(punkt, plotno);

	}


	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Kółko i Krzyżyk");
		scena.ustawRozmiar(340, 310);
		plotno.ustawRozmiar(340, 310);
		silnikGry = new KolkoIKrzyzykEngineImpl();
		silnikGry.rysujPlansze(plotno);
		// warunek czy pierwszy jest krzyzyk , jak jest false pierwsze jest kolko
		warunekCzyKrzyzyk = false;
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujPunkt(x, y);
	}

}
