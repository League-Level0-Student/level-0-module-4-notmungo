package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class testScores {
	public static void main(String[] args) {
		String test = JOptionPane.showInputDialog("What was your test score?") ;
		double test1 = Double.parseDouble(test) ;	
		if (test1 <= 75) {
			JOptionPane.showMessageDialog(null, "Wow study a little better next time!") ;
		}
		else if (test1 > 75) {
			JOptionPane.showMessageDialog(null, "Wow you are doing good!");
		}
	}
	
}
