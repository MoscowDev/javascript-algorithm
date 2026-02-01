import java.util.Scanner;

public class TypeOfNumber{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter first number: ");
	double first = scanner.nextDouble();

	System.out.print("Enter operator (-,+,/,*): ");
	char operator1 = scanner.next().charAt(0);

	System.out.print("Enter an integer second number: ");
	double second = scanner.nextDouble();

	double result;
	
	if (operator1 == '+') {
	result = first + second;
	System.out.println("The result: " + result);
	}	else if (operator1 == '-') {
	result = first - second;
	System.out.println("The result: " + result);
	}	else if (operator1 == '*') {
	result = first * second;
	System.out.println("The result: " + result);
	}	else if (operator1 == '/') {
	result = first / second;
	System.out.println("The result: " + result);
	}
	}
}
