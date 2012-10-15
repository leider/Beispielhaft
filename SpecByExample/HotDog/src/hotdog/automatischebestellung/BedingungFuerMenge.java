package hotdog.automatischebestellung;

import fit.ColumnFixture;

public class BedingungFuerMenge extends ColumnFixture {

	public int menge;

	public String wirdBestellt() {
		if (menge <= 10) {
			return "ja";
		}
		return "nein";
	}

}
