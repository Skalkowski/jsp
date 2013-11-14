package com.example.servletjspdemo.domain;

public class Druzyny {
	
	public Druzyny(){	

	}
	
	public Druzyny(String nazwa, String trener, String stadion, int rok, String komentarz, String [] kraj, String plec, String [] osiagniecia){
		super();
		this.nazwa = nazwa;
		this.trener = trener;
		this.stadion = stadion;
		this.rok = rok;
		this.komentarz = komentarz;
		this.kraj = kraj;
		this.plec = plec;
		this.osiagniecia = osiagniecia;	
	}
	
	public String getNazwa(){
		return nazwa;
	}
	
	public void setNazwa(String nazwa){
		this.nazwa = nazwa;
	}

	public String getTrener(){
		return trener;
	}
	
	public void setTrener(String trener){
		this.trener = trener;
	}
	
	

	public String getStadion(){
		return stadion;
	}
	
	public void setStadion(String stadion){
		this.stadion = stadion;
	}
	

	public int getRok(){
		return rok;
	}
	
	public void setRok(int rok){
		this.rok = rok;
	}
	

	public String getKomentarz(){
		return komentarz;
	}
	
	public void setKomentarz(String komentarz){
		this.komentarz = komentarz;
	}
	

	public String [] getKraj(){
		return kraj;
	}
	
	public void setKraj(String[] kraj){
		this.kraj = kraj;
	}
	

	public String getPlec(){
		return plec;
	}
	
	public void setPlec(String plec){
		this.plec = plec;
	}
	

	public String [] getOsiagniecia(){
		return osiagniecia;
	}
	
	public void setOsiagniecia(String[] osiagniecia) {
		
		this.osiagniecia = osiagniecia;
	}
	
	public String toString(String [] temp){
		String druk = "";
		for (int i = 0; i < temp.length; i++ ){
			druk = druk + ", "+ temp[i];
		}
		
		return druk;
	}
	
	
	private String nazwa = "wpisz nazwe";
	private String trener = "wpisz trenera";
	private String stadion = "wpisz stadion";
	private int rok = 1900;
	private String komentarz;
	private String [] kraj;
	private String plec;
	private String [] osiagniecia;
}
