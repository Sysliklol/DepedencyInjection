package com.mycompany.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Juggler implements Performer {
	private int beanBags = 3;
	public Juggler(){}
	public Juggler(int beanBags){
		this.beanBags = beanBags;
	}
	public void perform() {
		System.out.println("JUGGLING " +beanBags + " BEANBAGS");

	}

}
