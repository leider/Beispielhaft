package hotdog.system;

public class Mindestbestand {
	
	public int mindestbestandFuer(String wochentag) {
		if (wochentag.toLowerCase().equals("dienstag")) {
			return 20;
		}
		return 10;
	}
}
