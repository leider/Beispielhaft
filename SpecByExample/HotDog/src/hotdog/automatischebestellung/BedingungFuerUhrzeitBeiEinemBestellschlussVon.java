package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;

public class BedingungFuerUhrzeitBeiEinemBestellschlussVon {

	private final static int VORHANDENE_MENGE = 1;
	private final static int ERFORDERLICHE_MINDESTMENGE = 10;
	
	private LocalTime aktuelleUhrzeit;
	private LocalTime bestellschluss;

	public BedingungFuerUhrzeitBeiEinemBestellschlussVon(String bestellschluss) {
		this.bestellschluss = LocalTime.parse(bestellschluss);
	}
	
	public void setAktuelleUhrzeit(String uhrzeit){
		this.aktuelleUhrzeit = LocalTime.parse(uhrzeit);
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung().wirdBestellt(VORHANDENE_MENGE, ERFORDERLICHE_MINDESTMENGE, 
				aktuelleUhrzeit, bestellschluss);
	}

}
