package com.S_G_I.model;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
	
	private final List<Observer> observers = new ArrayList<Observer>();
	
	public void notifyObservers() {
		this.getObservers().forEach(elem -> elem.update(this));
	}
	
	public void addObserver(Observer obs) {
		this.getObservers().add(obs);
	}
	
	public boolean removeObserver(Observer obs) {
		return this.getObservers().remove(obs);
	}
	
	public List<Observer> getObservers() {
		return observers;
	}

}
