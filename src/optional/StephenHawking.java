package optional;

import javax.swing.JOptionPane;

import voce.SpeechSynthesizer;

public class StephenHawking {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++) {
			String sentence = JOptionPane.showInputDialog("Type your sentence:");
			if (sentence == null) System.exit(0);
			speak(sentence);
		}
	}
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		SpeechSynthesizer speaker = new SpeechSynthesizer("speaker");
		speaker.synthesize(words);
	}

}