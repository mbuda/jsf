package com.example.jsfdemo.domain;

import java.util.Date;

import javax.validation.constraints.*;

public class Komputer {
	
	private int id_komp;
	private String firma;
	@Size(min=5, max=15)
	private String model;
	@NotNull
	private String procesor;
	private double szybkosc;
	private boolean maKamere;
	private String typ;
	private int iloscWejscUsb;
	@Past
	@NotNull
	private Date dataWydania;
	
	
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

	public Date getDataWydania() {
		return dataWydania;
	}

	public void setDataWydania(Date dataWydania) {
		this.dataWydania = dataWydania;
	}
	
}
