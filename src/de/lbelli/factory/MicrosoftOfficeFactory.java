package de.lbelli.factory;

public class MicrosoftOfficeFactory extends SoftwareShop {
	protected OfficeProgram createOfficeApp(String appName) {
		OfficeProgram app = null;
		
		switch (appName) {
		case "Word": 		app = new Word(); break;
		case "Excel"	: 	app = new Excel(); break;
		case "PowerPoint" : app = new PowerPoint(); break;
		default: 			System.out.println("Ungültig");
		}
		 
		return app;
	}
}
