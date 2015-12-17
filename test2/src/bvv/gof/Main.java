package bvv.gof;

import bvv.gof.bridge.Circle;
import bvv.gof.bridge.Rectangle;
import bvv.gof.bridge.YellowColor;
import bvv.gof.builder.BaseBuilder;
import bvv.gof.builder.DBBuilder;
import bvv.gof.builder.User;
import bvv.gof.builder.XMLBuilder;
import bvv.gof.decorator.BusDriver;
import bvv.gof.decorator.CarDriver;
import bvv.gof.decorator.CarDriverAndForwardingAgent;
import bvv.gof.decorator.Driver;
import bvv.gof.factory.Base;
import bvv.gof.factory.Factory;
import bvv.gof.singlton.Singleton;

public class Main {

	private		static	User buildUser(BaseBuilder builder) {
		builder.buildLogin();
		builder.buildPassword();
		return		builder.getUser();
	}

	public	void	doDrive(Driver driver){
		driver.doit	();
	}
	public static void main(String[] args) {
		/*//Factory
		Base ob1 = Factory.getClassFromFactory("first");
		Base ob2 = Factory.getClassFromFactory("second");
		ob1.perform();
		ob2.perform();
		*/
		/*  //Builder
		User e1 = buildUser(new	XMLBuilder());
		User e2 = buildUser(new	DBBuilder());
		System.out.println(e1.getLogin());
		System.out.println(e1.getPassword());
		System.out.println(e2.getLogin());
		System.out.println(e2.getPassword());
		*/
		/*//Singleton
		for(int i=0; i<10;i++)
		{
			//System.out.println("i "+i);
			Singleton.getInstance();
		}
		*/
		/*
		YellowColor yc = new YellowColor();
		new Circle(yc).performWithColor();
		Rectangle r = new Rectangle(yc);
		r.performWithColor();
		*/
		/*// Decorator
		Driver carDriver = new	CarDriver();
		Main runner = new Main();
		runner.doDrive(carDriver);
		runner.doDrive(new	BusDriver(carDriver));
		runner.doDrive(new	CarDriverAndForwardingAgent(carDriver));
		*/
		
		
		}
	

}
