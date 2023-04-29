package com.S_G_I.main;

import com.S_G_I.model.*;

public class Main {
	
	private static ControlloSonda controlloSonda1;
    private static ControlloSonda controlloSonda2;
    private static ControlloSonda controlloSonda3;

    private static CentroControlloProxy controllo1;
    private static CentroControlloProxy controllo2;
    private static CentroControlloProxy controllo3;

	public static void main(String[] args) {
		
		Sonda s1 = new Sonda();
		s1.setId(1l);
		s1.setLatitudine(123.12);
		s1.setLongitudine(321.12);
		s1.setSmokeLevel(0);
		
		Sonda s2 = new Sonda();
		s2.setId(2l);
		s2.setLatitudine(456.12);
		s2.setLongitudine(654.12);
		s2.setSmokeLevel(6);
		
		Sonda s3 = new Sonda();
		s3.setId(3l);
		s3.setLatitudine(789.12);
		s3.setLongitudine(987.12);
		s3.setSmokeLevel(2);
				
		controllo1 = new CentroControlloProxy();
        controllo2 = new CentroControlloProxy();
        controllo3 = new CentroControlloProxy();

        controlloSonda1 = new ControlloSonda(1l, controllo1);
        controlloSonda2 = new ControlloSonda(2l, controllo2);
        controlloSonda3 = new ControlloSonda(3l, controllo3);

        s1.addObserver(controlloSonda1);
        s2.addObserver(controlloSonda2);
        s3.addObserver(controlloSonda3);


        if(s1.getSmokeLevel() > s1.limiteFumo) {
            System.out.println("Allarme incendio 1");
            controlloSonda1.update(s1);
        }

        if(s2.getSmokeLevel() > s2.limiteFumo) {
            System.out.println("Allarme incendio 2");
            controlloSonda2.update(s2);
        }
        
        if(s3.getSmokeLevel() > s3.limiteFumo) {
            System.out.println("Allarme incendio 3");
            controlloSonda2.update(s3);
        }
	}

}
