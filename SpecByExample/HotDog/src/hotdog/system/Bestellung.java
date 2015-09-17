package hotdog.system;

import org.joda.time.LocalTime;

public class Bestellung {

	private boolean bestellungUnterwegs;
	private Mindestbestand mindestbestand;
	private Bestellschluss bestellschluss;

	public Bestellung(Mindestbestand mindestbestand, Bestellschluss bestellschluss) {
		this.mindestbestand = mindestbestand;
		this.bestellschluss = bestellschluss;
	}
	
	public void versendeBestellung() {
		bestellungUnterwegs = true;
	}
	
	public boolean wirdBestellt(int vorhandeneMenge, LocalTime time) {
		return time.isBefore(bestellschluss.bestellschluss()) && vorhandeneMenge <= mindestbestand.mindestbestandFuer("montag") && !bestellungUnterwegs;
	}

}
