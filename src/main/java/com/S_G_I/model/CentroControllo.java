package com.S_G_I.model;

public class CentroControllo implements CentroControlloInterface {

    private Comunicazione comunicazione;

    public CentroControllo () {
        this.comunicazione = new Comunicazione();
    }

    @Override
    public void rilevaIncendio(InfoSonda info) {
        comunicazione.sendGet(info.getIdSonda(), info.getLatitudine(), info.getLongitudine(), info.getSmokeLevel());

    }

}