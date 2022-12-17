package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		while  (true) {
			String Calc = JOptionPane.showInputDialog("Give me a number");
			int num = Integer.parseInt(Calc);

			System.out.println(num);
			String Calc1 = JOptionPane.showInputDialog("Give me a number");
			int num1 = Integer.parseInt(Calc1);

			System.out.println(num);
			// 2. Customize pop-up to support add/subtract/multiply/divide operations.
			int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
					null);
			System.out.println(operation);
			// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
			if (operation == 0) {
				add(num, num1);
			}
			else if (operation == 1) {
				subtract(num,num1);
			}
			else if (operation == 2) {
				multiply(num,num1);
			}
			else  {
				quotient(num,num1);
			}
		}

		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	static void add(int num1,int num2)  

	{int sum	= num1 + num2 ; 
	String equation = num1 + " + " + num2 + " = " + sum;
	JOptionPane.showMessageDialog(null, equation);	}		

	static void subtract(int num1, int num2)

	{int difference = num1 - num2 ;
	String equation = num1 + " - " + num2 + " = " + difference ;
	JOptionPane.showMessageDialog(null, equation); }

	static void multiply(int num1,int num2)
	{int product = num1 * num2 ;
	String equation = num1 + " * " + num2 + " = " + product ;
	JOptionPane.showMessageDialog(null, equation); }

	static void quotient(int num1, int num2)

	{int quotient = num1 / num2 ;
	String equation = num1 + " / " + num2 + " = " + quotient;
	JOptionPane.showMessageDialog(null, equation);
	}




	// 4. Create similar methods for subtraction, multiplication and division.
}