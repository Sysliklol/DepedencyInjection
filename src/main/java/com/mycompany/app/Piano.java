package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Piano implements Instrument {
	public Piano(){}
	public void play() {
		System.out.println("PLINK PLINK");

	}

}
