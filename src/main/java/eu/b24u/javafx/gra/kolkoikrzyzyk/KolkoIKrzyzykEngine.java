package eu.b24u.javafx.gra.kolkoikrzyzyk;

import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.element.Punkt;

/**
 * Silnik gry zarzadzajacy tworzeniem elementow w grze
 * 
 * @author jakub-olszewski
 *
 */
public interface KolkoIKrzyzykEngine {

	/**
	 * Metoda rysuje plansze do gry 3x3
	 * 
	 * @param plotno
	 *            miejsce do rysowania
	 */
	void rysujPlansze(Plotno plotno);

	/**
	 * Metoda rysujaca kolko w punkcie p o wspolrzednych x,y
	 * 
	 * @param punkt
	 *            w ktorym narysowane bedzie kolko
	 * @param plotno
	 *            na ktorym rysujemy
	 */
	void rysujKolko(Punkt punkt, Plotno plotno);

	/**
	 * Metoda rysujaca krzyzyk w punkcie p o wspolrzednych x,y
	 * 
	 * @param punkt
	 *            w ktorym narysowany bedzie krzyzyk
	 * @param plotno
	 *            na ktorym rysujemy
	 * 
	 */
	void rysujKrzyzyk(Punkt punkt, Plotno plotno);

	void rysujInformacjeOWygranej(Plotno plotno);

	boolean czyKoniecGry();

	boolean czyWygralaFigura(Figura figura);

	Figura pobierzWygranego();

	void dodajRuch(Figura figura, Kratka kratka);

	void grajZBotem(boolean czyGraszZBotem);

}
