package de.lbelli.factory;

public class Word extends OfficeProgram {
	public void starten() { System.out.println("Word starten");}
}

class Excel extends OfficeProgram {
	public void starten() { System.out.println("Excel starten");}
}

class PowerPoint extends OfficeProgram {
	public void starten() { System.out.println("PowerPoint starten");}
}


