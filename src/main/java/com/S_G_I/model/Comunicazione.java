package com.S_G_I.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Comunicazione extends CanaleComunicazione{

    private static final Logger Logger = LoggerFactory.getLogger(Comunicazione.class);

    public void sendGet(Long idSonda, double latitude, double longitude, int fumo) {
        Logger.info("La sonda: " + idSonda + "Lat:" +  latitude + "Long" + longitude + "livello fumo: " + fumo);

    }

}