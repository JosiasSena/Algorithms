import javax.swing.JOptionPane;

/**
 * Remove all letter 'e' from the sentence
 */
public class RemoveEs {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Enter Your Sentence");
		
		if (sentence.contains("e")) {
			sentence = sentence.replaceAll("(?i)(e)", " "); // replaces all E's, upper-case AND lower-case
			JOptionPane.showMessageDialog(null, sentence); // Show the message without the e's
		}else {
			JOptionPane.showMessageDialog(null, "Darn, no e’s!");
		}
	}
}
