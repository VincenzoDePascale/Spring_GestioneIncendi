package com.S_G_I.model;


public class CentroControlloFactory {

    public static CentroControlloInterface creaCentroControllo() {
        return new CentroControllo();
    }

}
