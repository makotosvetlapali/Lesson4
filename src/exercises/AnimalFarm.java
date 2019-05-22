package exercises;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class AnimalFarm {

	AnimalFarm() {
		/* 1. Ask the user which animal they want, then play the sound of that animal. */

		/* 2. Make it so that the user can keep entering new animals. */
		int answer1 = 0;
		while (answer1 == 0) {
			int answer = JOptionPane.showOptionDialog(null, "Which animal do you want to hear next?", "Animal Farm", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cow", "Cat", "Dog", "Duck", "Llama", "Pig" },
					null);
			if (answer == 0)
				playMoo();
			else if (answer == 1)
				playMeow();
			else if (answer == 2)
				playWoof();
			else if (answer == 3)
				playQuack();
			else if (answer == 4)
				playLlama();
			else
				playOink();
			answer1 = JOptionPane.showConfirmDialog(null, "Do you want to hear another animal?", "",
					JOptionPane.YES_NO_OPTION);
		}
	}

	void playMoo() {
		playNoise(mooFile);
	}

	void playQuack() {
		playNoise(quackFile);
	}

	void playWoof() {
		playNoise(woofFile);
	}

	void playMeow() {
		playNoise(meowFile);
	}

	void playLlama() {
		playNoise(llamaFile);
	}

	void playOink() {
		playNoise(oinkFile);
	}

	String quackFile = "sound/quack.wav";
	String mooFile = "sound/moo.wav";
	String woofFile = "sound/woof.wav";
	String meowFile = "sound/meow.wav";
	String llamaFile = "sound/llama.wav";
	String oinkFile = "sound/oink.wav";

	/* Ignore this stuff */

	public void playNoise(String soundFile) {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFile));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new AnimalFarm();
	}
}
