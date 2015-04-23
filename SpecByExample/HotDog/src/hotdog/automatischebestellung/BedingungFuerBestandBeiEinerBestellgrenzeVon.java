package hotdog.automatischebestellung;


public class BedingungFuerBestandBeiEinerBestellgrenzeVon  {

	private int menge;
	private int grenze;

	public BedingungFuerBestandBeiEinerBestellgrenzeVon(int grenze) {
		this.grenze = grenze;
	}
	
	public void setMenge(int menge){
		this.menge = menge;
	}
	
	public Boolean wirdPotentiellBestellt() {
		return menge <= grenze;
	}

}
