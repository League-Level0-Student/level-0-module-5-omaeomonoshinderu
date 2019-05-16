package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {

public static void main(String[] args) {
	String num = JOptionPane.showInputDialog("What number do you want to know is composite?");
	int number = Integer.parseInt(num);
	
	
	for (int i = 2; i < number; i++) {
		
	if (number%i==0) {
		JOptionPane.showMessageDialog(null, "Your number is composite");
	System.exit(0);
	
	}
	
	}	
	JOptionPane.showMessageDialog(null, "Your number is composite");
}
}
