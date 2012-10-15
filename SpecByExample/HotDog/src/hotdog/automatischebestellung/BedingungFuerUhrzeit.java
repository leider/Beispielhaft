package hotdog.automatischebestellung;

import org.joda.time.LocalTime;

import fit.ColumnFixture;

public class BedingungFuerUhrzeit extends ColumnFixture {

	public String uhrzeit;

	public String wirdBestellt() {
		LocalTime time = LocalTime.parse(uhrzeit);
		if (time.isAfter(LocalTime.parse("15:59"))) {
			return "nein";
		}
		return "ja";
	}

}
