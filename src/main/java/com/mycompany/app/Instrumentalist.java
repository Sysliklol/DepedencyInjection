package com.mycompany.app;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Instrumentalist implements Performer {
	public Instrumentalist() {}
	
	public void perform() {
		System.out.print("Playing " + song + " : ");
		instrument.play();
		}
		private String song;
		@Autowired
		@Qualifier("Jingle Bells")
		public void setSong(String song) {
		this.song = song;
		}
		@NotNull
		public String getSong() {
		return song;
		}
		@NotNull
		public String screamSong() {
		return song;
		}
		private Instrument instrument;
		@Autowired
		@Qualifier("saxophone")
		public void setInstrument(Instrument instrument){
		this.instrument = instrument;
		}


}
