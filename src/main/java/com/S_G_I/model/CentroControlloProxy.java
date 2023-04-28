package com.S_G_I.model;

public class CentroControlloProxy implements CentroControlloInterface{
	
	private CentroControlloInterface centrocontrollointerface;

	public CentroControlloProxy() {
		centrocontrollointerface = CentroControlloFactory.createCentroControllo();
	}
	
	@Override
	public void rilevaIncendio(InfoSonda info) {
		centrocontrollointerface.rilevaIncendio(info);
	}
	

}
