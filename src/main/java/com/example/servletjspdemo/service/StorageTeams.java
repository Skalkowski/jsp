package com.example.servletjspdemo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.servletjspdemo.domain.Druzyny;
//symuluje baze danych
public class StorageTeams {

	private List<Druzyny> db = new ArrayList<Druzyny>();
	
	public void add(Druzyny druzyny){
		Druzyny newDruzyny = new Druzyny(druzyny.getNazwa(), druzyny.getTrener(), druzyny.getStadion(), druzyny.getRok(), druzyny.getKomentarz(), druzyny.getKraj(), druzyny.getPlec(), druzyny.getOsiagniecia());
		db.add(newDruzyny);
	}
	
	public List<Druzyny> getAllDruzyny(){
		return db;
	}
}
