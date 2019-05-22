package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {

	Robot walle = new Robot();

	void settings() {
		walle.penDown();
		walle.setSpeed(100);
		walle.setRandomPenColor();
		walle.setPenWidth(5);
		walle.setPos(new Random().nextInt(700) + 100, new Random().nextInt(400) + 100);
	}

	void circle() {
		settings();
		for (int i = 0; i < 360; i++) {
			walle.move(1);
			walle.turn(1);
		}
		walle.hide();
	}

	void square() {
		settings();
		for (int i = 0; i < 4; i++) {
			walle.move(100);
			walle.turn(90);
		}
		walle.hide();
	}

	void triangle() {
		settings();
		for (int i = 0; i < 3; i++) {
			walle.move(100);
			walle.turn(120);
		}
		walle.hide();
	}
	
	static void draw(int number) {
		if (number == 0)
			new ObedientRobot().circle();
		else if (number == 1)
			new ObedientRobot().square();
		else if (number == 2)
			new ObedientRobot().triangle();
		else
			System.exit(0);
	}

	public static void main(String[] args) {

		/*
		 * Create methods to draw a circle, square and triangle and call the appropriate
		 * one depending on the user choice.
		 */
		
		int answer = 0;
		do {
			int shape = JOptionPane.showOptionDialog(null, "Which shape would you like me to draw?", "Obedient Robot", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Circle", "Square", "Triangle" }, null);
			draw(shape);
			answer = JOptionPane.showConfirmDialog(null, "Do you want to draw another shape?", "",
					JOptionPane.YES_NO_OPTION);
		}while(answer == 0);

	}

}
