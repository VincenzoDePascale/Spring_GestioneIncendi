package com.S_G_I.model;

import lombok.Data;

@Data
public class Sonda extends Subject {

	private Long id;
	private double latitudine;
	private double longitudine;
	private int smokeLevel = 0;
	
	public final int SMOKE_THESHOLD = 5;
	
	public Sonda (Long id, double latitudine, double longitudine ) {
		this.id = id;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}
	
	public int getSmokeLevel() {
		return smokeLevel;
	}
	
	public void setSmokeLevel(int smokeLevel) {
		this.smokeLevel = smokeLevel;
		
		if (smokeLevel > SMOKE_THESHOLD) {
			super.notifyObservers();
		}
	}
	
}
