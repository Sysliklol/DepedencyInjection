package com.mycompany.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	Performer performer = (Performer) context.getBean("duke");
    	performer.perform();
    	Performer performer1 = (Performer) context.getBean("poeticDuke");
    	performer1.perform();
    	Instrument instrument = (Instrument) context.getBean("piano");
    	instrument.play();
    	Instrument instrument1 = (Instrument) context.getBean("saxophone");
    	instrument1.play();
    	Performer hank = (Performer) context.getBean("hank");
    	hank.perform();
    	Performer hank2 = (Performer) context.getBean("hank2");
    	hank2.perform();
    }
}
