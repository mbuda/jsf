package com.example.jsfdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import com.example.jsfdemo.domain.Komputer;


@ApplicationScoped
public class KomputerManager {

	
	private List<Komputer> db = new ArrayList<Komputer>();
	private static int id_komp = 0 ;
	
	public void addKomputer(Komputer komp) {
		Komputer newKomp = new Komputer();

		newKomp.setId_komp(id_komp);
		newKomp.setFirma(komp.getFirma());
		newKomp.setModel(komp.getModel());
		newKomp.setProcesor(komp.getProcesor());
		newKomp.setSzybkosc(komp.getSzybkosc());
		newKomp.setMaKamere(komp.isMaKamere());
		newKomp.setTyp(komp.getTyp());
		newKomp.setIloscWejscUsb(komp.getIloscWejscUsb());
		newKomp.setDataWydania(komp.getDataWydania());
		db.add(newKomp);	
		id_komp++;
	}

	// Usuwa komputer po id
	public void deleteKomp(Komputer kompDoUsuniecia) {
		Komputer kompUsuwany =  null;
		for (Komputer k : db) {
			if (k.getId_komp()==(kompUsuwany.getId_komp())) {
		kompUsuwany = k;
		db.remove(kompUsuwany);
				break;
			}
		}
	}
	
	public List<Komputer> getKompByModel(Komputer komp){
		List<Komputer> kompDoZnalezienia = new ArrayList<Komputer>();
		for(Komputer k: db){
			if(k.getModel().equals(komp.getModel())){
				kompDoZnalezienia.add(k);
			}
		}
		return kompDoZnalezienia;
	}

	public List<Komputer> getAllKomp() {
		return db;
	}
}


