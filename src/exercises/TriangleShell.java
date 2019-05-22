package exercises;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Instantiate a new Robot
	Robot walle = new Robot();

	void go() {
		// drawTriangle(100); //3. Remove this command, it's just for testing

		// 6. Make the robot go as fast as possible
		walle.setSpeed(100);

		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;
		// 7. Do all the steps below, 60 times
		for (int i = 0; i < 60; i++) {
			walle.setRandomPenColor();
			length += 10;
			drawTriangle(length);
			walle.turn(6);
		}
		// 9. Change the color of the pen to a random color

		// 8. Increase the length of the side by 10 pixels

		// 5. call your drawTriangle() method using your length variable

		// 10. Turn the robot 6 degrees to the right

	}

	/*
	 * 2. Fill in the method below to draw a triangle. Use the length variable for
	 * the size of the triangle.
	 */
	private void drawTriangle(int length) {
		walle.penDown();
		for (int i = 0; i < 3; i++) {
			walle.move(length);
			walle.turn(120);
		}

	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}