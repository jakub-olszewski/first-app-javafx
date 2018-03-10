package eu.b24u.javafx;


import eu.b24u.javafx.element.Punkt;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Plotno extends Canvas {

	private GraphicsContext context;

	public Plotno() {
		super();
		context = getGraphicsContext2D();
	}

	public void czysc() {
		context.clearRect(0, 0, 500, 500);
	}

	public void rysujOkrag(int startx, int starty, int promien) {
		rysujOkrag(startx, starty, promien, Color.BLUE);
	}

	/**
	 * jest to metoda ktora wypisuje tekst na plotnie
	 * 
	 * @param x
	 *            to wspolrzedna pozioma
	 * @param y
	 *            to wspolrzedna pionowa
	 * @param tekst
	 *            to napis wypisany na plotnie
	 */
	public void wypiszTekst(double x, double y, String tekst) {
		context.setFont(new Font("Arial", 12));
		context.fillText(tekst, x, y);
	}

	public void rysujOkrag(int startx, int starty, int promien, Color color) {
		context.setFill(color);
		context.setStroke(color);
		context.setLineWidth(5);
		context.fillOval(startx - promien / 2, starty - promien / 2, promien, promien);
	}

	/**
	 * 
	 * @param punktRysowania
	 *            jest to punkt w którym rysuje sie okrąg
	 * @param promien
	 *            odległość granicy okręgu od środka
	 * @param color
	 *            kolor okręgu
	 */
	public void rysujOkrag(Punkt punktRysowania, int promien, Color color) {
		rysujOkrag(punktRysowania.x, punktRysowania.y, promien, color);
	}

	public void wstawObrazek(double x, double y, String nazwaObrazka) {
		context.drawImage(Obrazek.pobierz(nazwaObrazka), x, y);
	}

	public void wstawObrazek(Punkt punktRysowania, String nazwaObrazka) {
		wstawObrazek(punktRysowania.x, punktRysowania.y, nazwaObrazka);
	}

	public void rysujLinie(int startx, int starty, int koniecx, int koniecy, Color color) {
		context.setFill(color);
		context.setStroke(color);
		context.setLineWidth(5);
		context.strokeLine(startx, starty, koniecx, koniecy);
	}

	public void rysujLinie(Punkt poczatek, Punkt koniec, Color color) {
		rysujLinie(poczatek.x, poczatek.y, koniec.x, koniec.y, color);
	}

	public void ustawRozmiar(double wysokosc, double szerokosc) {
		setHeight(wysokosc);
		setWidth(szerokosc);
	}

	public void rysujPunkt(double x, double y) {
		context.setFill(Color.BLACK);
		context.fillRect(x, y, 1, 1);
	}

	/**
	 * Metoda służy do rysowania prostokąta pomiędzy 2 punktami.
	 * 
	 * @param p1
	 *            to punkt 1
	 * @param p2
	 *            punkt 2
	 * @param kolor
	 *            to kolor prostokąta.
	 */
	public void rysujProstokat(Punkt p1, Punkt p2, Color kolor) {
		context.setFill(kolor);
		context.setStroke(kolor);
		context.setLineWidth(5);
		context.strokeRect(p1.x, p1.y, p2.x, p2.y);
	}


}
