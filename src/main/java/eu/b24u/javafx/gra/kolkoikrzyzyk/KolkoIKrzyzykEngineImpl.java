package eu.b24u.javafx.gra.kolkoikrzyzyk;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class KolkoIKrzyzykEngineImpl implements KolkoIKrzyzykEngine {

	@Override
	public void rysujPlansze(Plotno plotno) {
		// TODO rysowanie planszy 3x3 kratki
		// dwie linie poziome
		plotno.rysujLinie(new Punkt(0, 100), new Punkt(300, 100), Color.BLUE);
		plotno.rysujLinie(new Punkt(0, 200), new Punkt(300, 200), Color.BLUE);
		// dwie linie pionowe
		plotno.rysujLinie(new Punkt(100, 0), new Punkt(100, 300), Color.BLUE);
		plotno.rysujLinie(new Punkt(200, 0), new Punkt(200, 300), Color.BLUE);
	}

	@Override
	public void rysujKolko(Punkt punkt, Plotno plotno) {
		plotno.rysujOkrag(punkt, 50);
		plotno.rysujOkrag(punkt.x - 1, punkt.y - 1, 45, Color.WHITE);
	}

	@Override
	public void rysujKrzyzyk(Punkt punkt, Plotno plotno) {
		Punkt poczatek = new Punkt(punkt.x - 5, punkt.y - 5);
		Punkt koniec = new Punkt(punkt.x + 5, punkt.y + 5);
		plotno.rysujLinie(poczatek, koniec, Color.BLUE);

		Punkt poczatek2 = new Punkt(punkt.x + 5, punkt.y - 5);
		Punkt koniec2 = new Punkt(punkt.x - 5, punkt.y + 5);
		plotno.rysujLinie(poczatek2, koniec2, Color.BLUE);
	}

	@Override
	public void rysujInformacjeOWygranej(Plotno plotno) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean czyKoniecGry() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean czyWygralaFigura(Figura figura) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Figura pobierzWygranego() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dodajRuch(Figura figura, Kratka kratka) {
		// TODO Auto-generated method stub

	}

	@Override
	public void grajZBotem(boolean czyGraszZBotem) {
		// TODO Auto-generated method stub

	}

}
