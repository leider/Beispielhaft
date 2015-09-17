package hotdog.system;

import org.joda.time.LocalTime;

public class Bestellung {

	private boolean bestellungUnterwegs;

	public void versendeBestellung() {
		bestellungUnterwegs = true;
	}
	
	public boolean wirdBestellt(int vorhandeneMenge, int erforderlicheMindestmenge, LocalTime time, LocalTime schluss) {
		return time.isBefore(schluss) && vorhandeneMenge <= erforderlicheMindestmenge && !bestellungUnterwegs;
	}

}
