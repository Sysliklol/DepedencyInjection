package com.mycompany.app;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

public class OneManBand implements Performer {
	public OneManBand(){}
	public void perform() {
		// TODO Auto-generated method stub
		for (Instrument instrument:instruments){
			instrument.play();
		}
	}
	
	private Collection<Instrument> instruments;
	@Autowired
	public void setInstruments(Collection<Instrument> instruments){
		this.instruments = instruments;
	}

}
