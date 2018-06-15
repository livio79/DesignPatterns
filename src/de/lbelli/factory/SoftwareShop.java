package de.lbelli.factory;

//Enumaration statt String

public abstract class SoftwareShop {
	
	public OfficeProgram appHolen(String appName) {
		OfficeProgram app = createOfficeApp(appName);
		
		return app;
	}
	
	protected abstract OfficeProgram createOfficeApp(String appName);
}
