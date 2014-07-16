package hotdog.automatischebestellung;


public class Bestellgrenze {
	
	private String wochentag;
	
	public void setWochentag(String wochentag){
		this.wochentag = wochentag;
	}
	
	public int bestellgrenze() {
		if (wochentag.equalsIgnoreCase("dienstag")) {
			return 20;
		}
		return 10;
	}

}
