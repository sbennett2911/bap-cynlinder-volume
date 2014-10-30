/***********************************************************************
 Program Name: CylinderTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program allows user to input radius and height for
 a cylinder object.  The volume is calculated and displayed.  Cylinder
 objects are stored in an array.
 ***********************************************************************/ 

public class Cylinder {
	//declare variables
	double radius;
	double height;
	
	//default constructor
	public Cylinder(){
		radius = 0.0;
		height = 0.0;
	}
	
	//regular constructor
	public Cylinder(double aRadius, double aHeight){
		radius = aRadius;
		height = aHeight;
	}
	
	//copy constructor
	public Cylinder(Cylinder aCylinder){
		radius = aCylinder.radius;
		height = aCylinder.height;
	}
	
	//instance method volume() calculates volume based on input of radius and height
	public double volume(double aRadius, double aHeight){
		
		double cylinderVolume = aRadius * aRadius * aHeight * Math.PI;
		
		return cylinderVolume;
	}

}
