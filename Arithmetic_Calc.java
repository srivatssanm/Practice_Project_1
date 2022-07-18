// Phase_1 Practice Problem --> Arithmetic calculator


import java.util.Scanner;
public class Arithmetic_Calc {

	public static void main(String[] args)
	{
		
		double num1, num2;

		// creating object for scanner
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the numbers");

			// Getting the inputs

			System.out.print("Enter first number = ");

			num1 = input.nextDouble();

			System.out.print("Enter second number = ");

			num2 = input.nextDouble();

			System.out.print("Enter the operator (+,-,*,/) = ");

			char op = input.next().charAt(0);

			double r = 0;

			switch (op)
			{

			// Addition
			case '+':

				r = num1 + num2;

				break;

			// Subtraction
			case '-':

				r = num1 - num2;

				break;

			// Multiplication
			case '*':

				r = num1 * num2;

				break;

			// Division
			case '/':

				r = num1 / num2;

				break;

			default:

				System.out.println("You entered wrong input");

				break;
			}

			System.out.println("The final result:");

			System.out.println();

			// Final result
			System.out.println(num1 + " " + op + " " + num2
							+ " = " + r);
		}
	}
	
	}

