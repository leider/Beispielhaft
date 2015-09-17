package hotdog.automatischebestellung;


public class Mindestbestand {
	
	private String wochentag;
	
	public void setWochentag(String wochentag){
		this.wochentag = wochentag;
	}
	
	public int mindestbestand() {
		return new hotdog.system.Mindestbestand().mindestbestandFuer(wochentag);
	}
}
