package com.S_G_I.model;

public class CentroControlloHttp implements CentroControlloInterface {
	
	private ComunicazioneHttp canaleComunicazione;
	
	private static final String baseUrlNotiica = "http://host/alarm";
	
	public CentroControlloHttp() {
		this.canaleComunicazione = new ComunicazioneHttp(baseUrlNotiica);
	}
	
	@Override
	public void rilevaIncendio(InfoSonda info) {
		
		canaleComunicazione.sendGet(info.getIdSonda(), info.getLatitudine(), info.getLongitudine(), info.getSmokeLevel());
	}
}
