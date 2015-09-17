package hotdog.automatischebestellung;

import org.joda.time.LocalTime;

import hotdog.system.Bestellung;

public class BedingungFuerBestellstatus {

	private final static int VORHANDENE_MENGE = 1;
	private final static int MINDESTBESTAND = 10;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung(mindestbestand, bestellschluss);
	}
	
	public void setBestellungBereitsVersandt(Boolean versandt) {
		if(versandt) {
			bestellung.versendeBestellung();
		}
	}
	
	public Boolean wirdPotentiellBestellt() {
		return bestellung.wirdBestellt(VORHANDENE_MENGE, AKTUELLE_UHRZEIT, "montag");
	}
	
	private final static hotdog.system.Mindestbestand mindestbestand = new hotdog.system.Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};

	private final static hotdog.system.Bestellschluss bestellschluss = new hotdog.system.Bestellschluss() {
		public LocalTime bestellschluss() { return BESTELLSCHLUSS; };
	};
}
