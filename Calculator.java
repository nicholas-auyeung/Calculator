package Calculator;
import java.util.Scanner;
public class Calculator {
	
	private static double result;
	
	static void addition(double firstNum, double secondNum) {
		result = firstNum + secondNum;
		System.out.println("Result: " + result);
	}
	static void subtraction(double firstNum, double secondNum) {
		result = firstNum - secondNum;
		System.out.println("Result: " + result);
	}
	static void multiplication(double firstNum, double secondNum) {
		result = firstNum * secondNum;
		System.out.println("Result: " + result);
	}
	static void division(double firstNum, double secondNum) {
		result = firstNum / secondNum;
		System.out.println("Result: " + result);
	}
	
	public static void main(String[] args) {
		double firstNum, secondNum;
		char operation;
		boolean moreCalc = true;
		Scanner scan = new Scanner(System.in);
		
		while(moreCalc == true) {
			System.out.println("Welcome to Calculator" + "\n");
			System.out.println("Enter any letter to exit");
			System.out.println("What operation would you like to perform?" + "\n");
			System.out.println("(1) Addition");
			System.out.println("(2) Subtraction");
			System.out.println("(3) Multiplication");
			System.out.println("(4) Division");
			operation = scan.next().charAt(0);
			System.out.println("Enter the two numbers: ");
			firstNum = scan.nextDouble();
			secondNum = scan.nextDouble();
			
			switch(operation) {
				case '1':
					addition(firstNum, secondNum);
					break;
				case '2':
					subtraction(firstNum, secondNum);
					break;
				case '3':
					multiplication(firstNum, secondNum);
					break;
				case '4':
					division(firstNum, secondNum);
					break;
				default:
					System.out.println("Exiting...");
					moreCalc = false;
					break;
			}
		}
		
	}

}
