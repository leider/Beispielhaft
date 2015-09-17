package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;


public class BedingungFuerBestandBeiEinemMindestbestandVon  {

	private int aktuellerBestand;
	private final hotdog.system.Mindestbestand mindestbestand;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	public BedingungFuerBestandBeiEinemMindestbestandVon(final int mindestbestand) {
		this.mindestbestand = new hotdog.system.Mindestbestand() {
			public int mindestbestandFuer(String wochentag) { return mindestbestand; }
		};
	}
	
	public void setAktuellerBestand(int aktuellerBestand){
		this.aktuellerBestand = aktuellerBestand;
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung(mindestbestand).wirdBestellt(aktuellerBestand, AKTUELLE_UHRZEIT, BESTELLSCHLUSS);
	}

}
