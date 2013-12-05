package com.example.jsfdemo.domain;

import javax.validation.constraints.*;

public class Komputer {
	
	private int id_komp;
	private String firma;
	private String model;
	private String procesor;
	private double szybkosc;
	private boolean maKamere;
	private String typ;
	private int iloscWejscUsb;
	@Max(2013)
	@NotNull
	private int dataWydania;
	
	
	public Komputer(){
		
	}
	
	public int getId_komp() {
		return id_komp;
	}
	public void setId_komp(int id_komp) {
		this.id_komp = id_komp;
	}
	public String getFirma() {
		return firma;
	}
	public void setFirma(String firma) {
		this.firma = firma;
	}
	
	//@Size(min = 2, max= 25)
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getProcesor() {
		return procesor;
	}
	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}
	public double getSzybkosc() {
		return szybkosc;
	}
	public void setSzybkosc(double szybkosc) {
		this.szybkosc = szybkosc;
	}
	public boolean isMaKamere() {
		return maKamere;
	}
	public void setMaKamere(boolean maKamere) {
		this.maKamere = maKamere;
	}
	public String getTyp() {
		return typ;
	}
	public void setTyp(String typ) {
		this.typ = typ;
	}
	public int getIloscWejscUsb() {
		return iloscWejscUsb;
	}
	public void setIloscWejscUsb(int iloscWejscUsb) {
		this.iloscWejscUsb = iloscWejscUsb;
	}
	public int getDataWydania() {
		return dataWydania;
	}
	public void setDataWydania(int dataWydania) {
		this.dataWydania = dataWydania;
	}

	
	
	
}
