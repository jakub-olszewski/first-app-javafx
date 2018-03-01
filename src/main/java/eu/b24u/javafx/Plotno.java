package eu.b24u.javafx;


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

	public void wypiszTekst(double x, double y, String tekst) {
		context.setFont(new Font("Arial", 12));
		context.fillText(tekst, x, y);
	}

	public void rysujOkrag(int startx, int starty, int promien, Color color) {
		context.setFill(color);
		context.setStroke(color);
		context.setLineWidth(5);
		context.fillOval(startx, starty, promien, promien);
	}

	public void wstawObrazek(double x, double y, String nazwaObrazka) {
		context.drawImage(Obrazek.pobierz(nazwaObrazka), x, y);
	}

	public void rysujLinie(int startx, int starty, int koniecx, int koniecy) {
		context.setFill(Color.BLUE);
		context.setStroke(Color.BLUE);
		context.setLineWidth(5);
		context.strokeLine(startx, starty, koniecx, koniecy);

	}

	public void ustawRozmiar(double wysokosc, double szerokosc) {
		setHeight(wysokosc);
		setWidth(szerokosc);
	}

	public void rysujPunkt(double x, double y) {
		context.setFill(Color.BLACK);
		context.fillRect(x, y, 1, 1);
	}

}
