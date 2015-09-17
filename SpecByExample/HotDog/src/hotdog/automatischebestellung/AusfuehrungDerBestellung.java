package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;

public class AusfuehrungDerBestellung {

	private final static int MINDESTBESTAND = 10;
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now();

	private int vorhandeneMenge;
	private LocalTime aktuelleUhrzeit;
	private Bestellung bestellung;

	public void reset() {
		bestellung = new Bestellung();
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
		return bestellung.wirdBestellt(vorhandeneMenge, MINDESTBESTAND, aktuelleUhrzeit, BESTELLSCHLUSS);
	}
}
