package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;

public class BedingungFuerUhrzeitBeiEinemBestellschlussVon {

	private final static int VORHANDENE_MENGE = 1;
	private final static int MINDESTBESTAND = 10;
	
	private LocalTime aktuelleUhrzeit;
	private hotdog.system.Bestellschluss bestellschluss;

	public BedingungFuerUhrzeitBeiEinemBestellschlussVon(String bestellschluss) {
		this.bestellschluss = new hotdog.system.Bestellschluss() {
			public LocalTime bestellschluss() { return LocalTime.parse(bestellschluss); };
		};
	}
	
	public void setAktuelleUhrzeit(String uhrzeit){
		this.aktuelleUhrzeit = LocalTime.parse(uhrzeit);
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung(mindestbestand, bestellschluss).wirdBestellt(VORHANDENE_MENGE, aktuelleUhrzeit);
	}
	
	private final static hotdog.system.Mindestbestand mindestbestand = new hotdog.system.Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};
}
