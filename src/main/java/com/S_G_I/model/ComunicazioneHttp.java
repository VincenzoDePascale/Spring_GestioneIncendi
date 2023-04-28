package com.S_G_I.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ComunicazioneHttp extends CanaleComunicazione{
	
	private static final Logger Logger = LoggerFactory.getLogger(ComunicazioneHttp.class);
	
	private String baseurlnotifica;
	
	public ComunicazioneHttp(String baseurlnotifica) {
		this.baseurlnotifica = baseurlnotifica;
	}
	
	public void sendGet(Long idSonda, double latitudine, double longitudine, int smokelevel) {
		Logger.info("Allarme sonda: {} - lat; {} - livello fumo: {}", idSonda, latitudine, longitudine, smokelevel);
		
	String url = baseurlnotifica + "?=idosnda=" + idSonda + "&lat=" + latitudine + "&lon=" + longitudine + "&smokeLevel=" + smokelevel;
	Logger.info("Call: {}", url);
	
	}

}
