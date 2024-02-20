package exercise3;

public class Kaupunki {
	
	private String nimi;
	private String maa;
    private int asukasluku;
    
    public Kaupunki(String nimi, String maa, int asukasluku) {
    	super();
    	this.nimi = nimi;
    	this.maa = maa;
    	this.asukasluku = asukasluku;
    	
    }

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getMaa() {
		return maa;
	}

	public void setMaa(String maa) {
		this.maa = maa;
	}

	public int getAsukasluku() {
		return asukasluku;
	}

	public void setAsukasluku(int asukasluku) {
		this.asukasluku = asukasluku;
	}

}
