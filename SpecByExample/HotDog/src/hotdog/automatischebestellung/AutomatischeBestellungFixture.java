package hotdog.automatischebestellung;

import org.joda.time.LocalTime;

import fit.ColumnFixture;

public class AutomatischeBestellungFixture extends ColumnFixture {

	public String wochentag;
	public int menge;
	public String uhrzeit;

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
