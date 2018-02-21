package com.mycompany.app;
import org.aspectj.lang.JoinPoint;  
public class Greeter {

	
	public void greet(JoinPoint jp)  
    {  
        System.out.println("Greetings traveller");  
        
    }  
}
