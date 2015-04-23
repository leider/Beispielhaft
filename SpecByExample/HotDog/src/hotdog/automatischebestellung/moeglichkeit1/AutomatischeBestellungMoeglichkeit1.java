package hotdog.automatischebestellung.moeglichkeit1;

import org.joda.time.LocalTime;

public class AutomatischeBestellungMoeglichkeit1 {

	private String wochentag;
	private int menge;
	private String uhrzeit;

	public void setWochentag(String wochentag) {
		this.wochentag = wochentag;
	}
	
	public void setMenge(int menge){
		this.menge = menge;
	}

	public void setUhrzeit(String uhrzeit) {
		this.uhrzeit = uhrzeit;
	}
	
	public boolean wirdBestellt() {
		LocalTime time = LocalTime.parse(uhrzeit);
		if (time.isAfter(LocalTime.parse("15:59"))) {
			return false;
		}
		int limit = 10;
		if (wochentag.equalsIgnoreCase("dienstag")) {
			limit = 20;
		}
		return menge <= limit;
	}
}
