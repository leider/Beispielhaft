package hotdog.automatischebestellung;


public class BedingungFuerMenge  {

	private int menge;

	public void setMenge(int menge){
		this.menge = menge;
	}
	
	public String wirdPotentiellBestellt() {
		if (menge <= 10) {
			return "ja";
		}
		return "nein";
	}

}
