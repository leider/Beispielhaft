package hotdog.automatischebestellung;

import hotdog.system.Bestellung;

import org.joda.time.LocalTime;


public class BedingungFuerBestandBeiEinerBestellgrenzeVon  {

	private int menge;
	private int grenze;
	private static final LocalTime AKTUELLE_UHRZEIT = LocalTime.now();
	private static final LocalTime BESTELLSCHLUSS = LocalTime.now().plusHours(1);

	public BedingungFuerBestandBeiEinerBestellgrenzeVon(int grenze) {
		this.grenze = grenze;
	}
	
	public void setMenge(int menge){
		this.menge = menge;
	}
	
	public Boolean wirdPotentiellBestellt() {
		return new Bestellung().wirdBestellt(menge, grenze, AKTUELLE_UHRZEIT, BESTELLSCHLUSS);
	}

}
