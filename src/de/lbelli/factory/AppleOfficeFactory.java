package de.lbelli.factory;

public class AppleOfficeFactory extends SoftwareShop {
	 
	protected OfficeProgram createOfficeApp(String appName) {
		OfficeProgram app = null;
		
		switch (appName) {
		case "Pages":	app = new Pages(); break;
		case "Keynote":	app = new Keynote(); break;
		case "Numbers": app = new Numbers(); break;
		default:		System.out.println("Ungültig");
		}
		
		return app;
	}
}
