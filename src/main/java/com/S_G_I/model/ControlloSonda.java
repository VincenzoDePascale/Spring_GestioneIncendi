package com.S_G_I.model;

public class ControlloSonda implements Observer {
	
	private final Long id;
	
	private CentroControlloInterface centroControllo;
	
	public ControlloSonda (Long id, CentroControlloInterface centroControllo) {
		this.id = id;
		this.centroControllo = centroControllo;
	}
	
	@Override
	public void update(Subject obj) {
		InfoSonda info = createInfoSonda((Sonda)obj);
		centroControllo.rilevaIncendio(info);
	}
	
	private InfoSonda createInfoSonda(Sonda obj) {
		return new InfoSonda(obj.getId(), obj.getLatitudine(), obj.getLongitudine(), obj.getSmokeLevel());
	}
	
	public Long getId() {
		return id;
	}
}
