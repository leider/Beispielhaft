package hotdog.automatischebestellung;


public class Bestellgrenze {
	
	private String wochentag;
	
	public void setWochentag(String wochentag){
		this.wochentag = wochentag;
	}
	
	public int bestellgrenze() {
		return hotdog.system.Bestellgrenze.bestellgrenzeFuer(wochentag);
	}
}
