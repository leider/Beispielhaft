package hotdog.system;

import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalTime;

import java.time.LocalDate;

public class Bestellung {

	private boolean bestellungUnterwegs;
	private Mindestbestand mindestbestand;

	public Bestellung(Mindestbestand mindestbestand) {
		this.mindestbestand = mindestbestand;
	}
	
	public void versendeBestellung() {
		bestellungUnterwegs = true;
	}
	
	public boolean wirdBestellt(int vorhandeneMenge, LocalTime time, LocalTime schluss) {
		System.out.println("time: " + time + " schluss: " + schluss + " vorhanden: " + vorhandeneMenge + " mindest: " +
				mindestbestand.mindestbestandFuer("montag") + " bestellung unterwegs: " + bestellungUnterwegs);
		return time.isBefore(schluss) && vorhandeneMenge <= mindestbestand.mindestbestandFuer("montag") && !bestellungUnterwegs;
	}

}
