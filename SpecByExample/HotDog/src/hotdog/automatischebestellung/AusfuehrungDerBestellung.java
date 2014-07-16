package hotdog.automatischebestellung;

public class AusfuehrungDerBestellung {

	private boolean bestellgrenze;
	private boolean bestellschluss;

	public void setBestellgrenzeIstUnterschritten(Boolean bestellgrenze){
		this.bestellgrenze = bestellgrenze;
	}
	
	public void setBestellschlussIstNochNichtErreicht(Boolean bestellschluss){
		this.bestellschluss = bestellschluss;
	}
	
	public Boolean wirdBestellt(){
		return bestellgrenze && bestellschluss;
	}
}
