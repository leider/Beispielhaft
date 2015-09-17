package hotdog.system;

public class Bestellgrenze {
	
	public static int bestellgrenzeFuer(String wochentag) {
		if (wochentag.equalsIgnoreCase("dienstag")) {
			return 20;
		}
		return 10;
	}
}
