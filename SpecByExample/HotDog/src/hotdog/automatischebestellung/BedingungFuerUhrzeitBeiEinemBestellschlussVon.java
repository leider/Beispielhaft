package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;

public class BedingungFuerUhrzeitBeiEinemBestellschlussVon {

	private final static int VORHANDENE_MENGE = 1;
	private final static int MINDESTBESTAND = 10;
	
	private LocalTime aktuelleUhrzeit;
	private LocalTime bestellschluss;

	public BedingungFuerUhrzeitBeiEinemBestellschlussVon(String bestellschluss) {
		this.bestellschluss = LocalTime.parse(bestellschluss);
	}
	
	public void setAktuelleUhrzeit(String uhrzeit){
		this.aktuelleUhrzeit = LocalTime.parse(uhrzeit);
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung(mindestbestand).wirdBestellt(VORHANDENE_MENGE, aktuelleUhrzeit, 
				bestellschluss);
	}
	
	private final static hotdog.system.Mindestbestand mindestbestand = new hotdog.system.Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};

}
