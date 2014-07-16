package hotdog.automatischebestellung;

import org.joda.time.LocalTime;

public class BedingungFuerUhrzeit {

	private String uhrzeit;

	public void setUhrzeit(String uhrzeit){
		this.uhrzeit = uhrzeit;
	}
	
	public String wirdPotentiellBestellt() {
		LocalTime time = LocalTime.parse(uhrzeit);
		if (time.isAfter(LocalTime.parse("15:59"))) {
			return "nein";
		}
		return "ja";
	}

}
