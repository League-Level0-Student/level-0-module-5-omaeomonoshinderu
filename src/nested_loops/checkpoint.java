package nested_loops;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class checkpoint {
	public static void main(String[] args) {
		String FavColor = JOptionPane.showInputDialog("What's your favorite color");
		JOptionPane.showMessageDialog(null, "Your favorite color is "+FavColor);
Robot big = new Robot();
big.penDown();
big.setSpeed(1000000);
for (int i = 0; i < 3; i++) {
	big.move(100);
	big.turn(120);
}
big.penUp();
big.hide();
	}
}
