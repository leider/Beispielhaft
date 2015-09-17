package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;

public class AusfuehrungDerBestellung {

	private final static int MINDESTBESTAND = 10;
	private static final LocalTime BESTELLSCHLUSS = new LocalTime(12); // 12:00:00

	private int vorhandeneMenge;
	private LocalTime aktuelleUhrzeit;
	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung(mindestbestand);
	}
	
	public void setMindestbestandIstUnterschritten(Boolean mindestbestandUnterschritten){
		if(mindestbestandUnterschritten){
			vorhandeneMenge = MINDESTBESTAND - 5;
		} else {
			vorhandeneMenge = MINDESTBESTAND + 5;
		}
	}
	
	public void setBestellschlussIstSchonErreicht(Boolean bestellschlussErreicht){
		if(bestellschlussErreicht) {
			aktuelleUhrzeit = BESTELLSCHLUSS.plusHours(1);
		} else {
			aktuelleUhrzeit = BESTELLSCHLUSS.minusHours(1);			
		}
	}
	
	public void setBestellungBereitsVersandt(Boolean versandt){
		if(versandt) {
			bestellung.versendeBestellung();
		}
	}
	
	public Boolean wirdBestellt(){
		return bestellung.wirdBestellt(vorhandeneMenge, aktuelleUhrzeit, BESTELLSCHLUSS);
	}
	
	private final static hotdog.system.Mindestbestand mindestbestand = new hotdog.system.Mindestbestand() {
		public int mindestbestandFuer(String wochentag) { return MINDESTBESTAND; }
	};

}
