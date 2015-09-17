package hotdog.automatischebestellung;

import org.joda.time.LocalTime;

import hotdog.system.Bestellung;

public class BedingungFuerBestellstatus {

	private final static int VORHANDENE_MENGE = 1;
	private final static int ERFORDERLICHE_MINDESTMENGE = 10;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung();
	}
	
	public void setBestellungBereitsVersandt(Boolean versandt) {
		if(versandt) {
			bestellung.versendeBestellung();
		}
	}
	
	public Boolean wirdPotentiellBestellt() {
		return bestellung.wirdBestellt(VORHANDENE_MENGE, ERFORDERLICHE_MINDESTMENGE, AKTUELLE_UHRZEIT, BESTELLSCHLUSS);
	}
}
