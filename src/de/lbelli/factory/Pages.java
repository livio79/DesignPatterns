package de.lbelli.factory;

public class Pages extends OfficeProgram {
	public void starten() { System.out.println("Pages starten");}
}

class Keynote extends OfficeProgram {
	public void starten() { System.out.println("Keynote starten");}
}

class Numbers extends OfficeProgram {
	public void starten() { System.out.println("Numbers starten");}
}
