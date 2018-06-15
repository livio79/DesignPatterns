package de.lbelli.factory;

public class Client {
	static String [] apps = {"Word", "Excel", "Powerpoint", "Keynote", "Numbers", "Pages"};
	

	
	public static void main(String[] args) {
		SoftwareShop shop = new MicrosoftOfficeFactory();
		OfficeProgram app = shop.createOfficeApp(apps[4]);
	
		 
	}
}
