package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickel = JOptionPane.showInputDialog("How many nickels do you have?") ;
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer
String dime = JOptionPane.showInputDialog("How many dimes do you have?") ;
		// Ask the user how many quarters they have, and convert their answer


		// Calculate how much money the user has.  Hint: Use a double variable 
 double dime1 = Integer.parseInt(dime) *.10 ;
 
 double nickel1 = Integer.parseInt(nickel) *.05 ;
 double totalAmount = dime1 + nickel1 ;
 JOptionPane.showMessageDialog(null, "Here is how much you have" + totalAmount);
 
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)

	}
}

