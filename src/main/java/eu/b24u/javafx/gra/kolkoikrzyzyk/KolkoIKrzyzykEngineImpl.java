package eu.b24u.javafx.gra.kolkoikrzyzyk;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class KolkoIKrzyzykEngineImpl implements KolkoIKrzyzykEngine {

	@Override
	public void rysujPlansze(Plotno plotno) {
		// TODO rysowanie planszy 3x3 kratki
		plotno.rysujLinie(new Punkt(0, 0), new Punkt(100, 100), Color.BLUE);
	}

	@Override
	public void rysujKolko(Punkt punkt, Plotno plotno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void rysujKrzyzyk(Punkt punkt, Plotno plotno) {
		// TODO Auto-generated method stub

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
