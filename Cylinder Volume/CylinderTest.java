/***********************************************************************
 Program Name: CylinderTest.java
 Programmer's Name: Steven Bennett
 Program Description: Program allows user to input radius and height for
 a cylinder object.  The volume is calculated and displayed.  Cylinder
 objects are stored in an array.
 ***********************************************************************/ 
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CylinderTest {

	public static void main(String[] args) {
		
		//declare array to hold 3 Cylinder objects.
		Cylinder[] cylinderArray = new Cylinder[3];
		
		//create 3 cylinder objects
		for (int i = 0; i < 3; i++){
			cylinderArray[i] = new Cylinder();
			
		}
		
		//prompt for user input to set dimensions of each cylinder
		for (int i = 0; i < 3; i++){
			try{
				cylinderArray[i].radius = Integer.parseInt(JOptionPane.showInputDialog("Input Radius of Cylinder " + (i + 1)));
				cylinderArray[i].height = Integer.parseInt(JOptionPane.showInputDialog("Input Height of Cylinder " + (i + 1)));
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Invalid Input!", "INPUT ERROR",JOptionPane.ERROR_MESSAGE);
				i--;
			}//end try/catch block for input.
		}
		
		//display contents of each element of the cylinderArray
		DecimalFormat dformat = new DecimalFormat("0.##"); //format volume output to two decimal places.
		String output = "";
		
		for (int i = 0; i < 3; i++){
				output += "Cylinder " + (i + 1) + ":  " + "radius = " + cylinderArray[i].radius +
						"  height = " + cylinderArray[i].height + "  volume = " + dformat.format(cylinderArray[i].volume(cylinderArray[i].radius, cylinderArray[i].height)) + "\n\n";
		}
		
		JOptionPane.showMessageDialog(null, output, "Cylinder Test", JOptionPane.PLAIN_MESSAGE);
		
		//terminate program
		System.exit(0);
	}

}
