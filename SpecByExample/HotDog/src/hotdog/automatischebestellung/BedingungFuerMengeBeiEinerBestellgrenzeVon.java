package hotdog.automatischebestellung;


public class BedingungFuerMengeBeiEinerBestellgrenzeVon  {

	private int menge;
	private int grenze;

	public BedingungFuerMengeBeiEinerBestellgrenzeVon(int grenze) {
		this.grenze = grenze;
	}
	
	public void setMenge(int menge){
		this.menge = menge;
	}
	
	public String wirdPotentiellBestellt() {
		if (menge <= grenze) {
			return "ja";
		}
		return "nein";
	}

}
