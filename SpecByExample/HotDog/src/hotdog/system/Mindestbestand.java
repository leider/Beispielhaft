package hotdog.system;

public class Mindestbestand {
	
	public int mindestbestandFuer(String wochentag) {
		if (wochentag.equalsIgnoreCase("dienstag")) {
			return 20;
		}
		return 10;
	}
}
