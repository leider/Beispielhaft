package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;


public class BedingungFuerBestandBeiEinemMindestbestandVon  {

	private int aktuellerBestand;
	private int mindestbestand;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	public BedingungFuerBestandBeiEinemMindestbestandVon(int mindestbestand) {
		this.mindestbestand = mindestbestand;
	}
	
	public void setAktuellerBestand(int aktuellerBestand){
		this.aktuellerBestand = aktuellerBestand;
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung().wirdBestellt(aktuellerBestand, mindestbestand, AKTUELLE_UHRZEIT, BESTELLSCHLUSS);
	}

}
