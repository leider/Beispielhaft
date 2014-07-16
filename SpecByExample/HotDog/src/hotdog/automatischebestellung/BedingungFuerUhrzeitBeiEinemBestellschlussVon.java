package hotdog.automatischebestellung;

import org.joda.time.LocalTime;

public class BedingungFuerUhrzeitBeiEinemBestellschlussVon {

	private String uhrzeit;
	private LocalTime schluss;

	public BedingungFuerUhrzeitBeiEinemBestellschlussVon(String schluss) {
		this.schluss = LocalTime.parse(schluss);
	}
	
	public void setUhrzeit(String uhrzeit){
		this.uhrzeit = uhrzeit;
	}
	
	public String wirdPotentiellBestellt() {
		LocalTime time = LocalTime.parse(uhrzeit);
		if (time.isBefore(schluss)) {
			return "ja";
		}
		return "nein";
	}

}
