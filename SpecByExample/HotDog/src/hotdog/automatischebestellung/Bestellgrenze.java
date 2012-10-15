package hotdog.automatischebestellung;

import fit.ColumnFixture;

public class Bestellgrenze extends ColumnFixture {
	
	public String wochentag;
	
	public int bestellgrenze() {
		if (wochentag.equalsIgnoreCase("dienstag")) {
			return 20;
		}
		return 10;
	}

}
