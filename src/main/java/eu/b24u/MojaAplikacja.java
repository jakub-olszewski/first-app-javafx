package eu.b24u;


import eu.b24u.gra.elementy.Chmurka;
import eu.b24u.gra.elementy.Ludzik;
import eu.b24u.javafx.Aplikacja;
import eu.b24u.javafx.Plotno;
import eu.b24u.javafx.Program;
import eu.b24u.javafx.Scena;
import eu.b24u.javafx.element.Punkt;
import javafx.scene.paint.Color;

public class MojaAplikacja extends Aplikacja {

	private Punkt punktRysowaniaLudzika;

	@Override
	public void zdarzenieKlikniecaMyszka(double x, double y, Plotno plotno) {
		Program.wypisz("Punkt punkt = stworzPunkt( x + (" + ((int) x - punktRysowaniaLudzika.x) + ") ,y + ( "
				+ ((int) y - punktRysowaniaLudzika.y) + "),plotno);");
		// plotno.czysc();
		Punkt punkt = new Punkt(x, y);
		plotno.rysujOkrag(punkt, 20, Color.ORANGE);
	}


	@Override
	public void budujScene(Scena scena, Plotno plotno) {
		scena.ustawTytul("Moja pierwsza aplikacja");
		scena.ustawRozmiar(500, 500);
		plotno.ustawRozmiar(500, 500);

		plotno.wstawObrazek(0, 150, "background.jpg");
		// to jest komentarz
		// TypZmiennej nazwaZmiennej = wartość;
		String imie = "Aga ";
		int wiek = 12;
		plotno.wypiszTekst(50, 80, "Witamy");
		plotno.wypiszTekst(50, 100, "na zajeciach z programowania :)");

		plotno.wypiszTekst(50, 120, imie + wiek);
		Program.wypisz("hej");
		punktRysowaniaLudzika = new Punkt(80, 250);
		Ludzik stefanLudzik = new Ludzik(plotno, punktRysowaniaLudzika, true);
		Punkt punktRysowaniaChmurki = new Punkt(200, 250);
		Chmurka chmurkaStefana = new Chmurka(plotno, punktRysowaniaChmurki, true);
		chmurkaStefana.wstawTekstWChmurce("Tekst w chmurce ludzika");
	}

	@Override
	public void zdarzeniePrzeciagniecieMyszka(double x, double y, Plotno plotno) {
		// TODO Auto-generated method stub
		plotno.rysujPunkt(x, y);
	}

}
