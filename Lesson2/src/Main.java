import java.io.PrintStream;
import java.util.Scanner;

import javax.script.ScriptEngineManager;

public class Main {

	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		byte b = 127;
		short s = 2;
		int i = 2;
		long l = 2;

		float f = 2;
		double d = 2;

		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = (char) (ch1 + ch2);

		boolean b1 = true;
		System.out.println(ch3);

		int y[] = new int[] { 1, 2, 3, };

		Calc calc = new Calc();

		float result1 = calc.addition(10, 20);
		float result2 = calc.subtraction(10, 20);
		float result3 = calc.multiplacation(10, 20);
		float result4 = calc.division(10, 20);

		System.out.println(result1 + result2 + result3 + result4);

		calc("+5 + -12");
		calc("+5 * -12");
		calc("+5 - -12");
		calc("+5 / -12");
		
		
		Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Ошибка!");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
        
        */
        
		Calc calc = new Calc();
        System.out.println(calc.min("asdfgfgnsdnmhmjgfhghhjhjfghj"));
        System.out.println(calc.max("asdfgfgnsdnmhmjgfhghhjhjfghj"));

	}

	private static void calc(String expression) {
		try {
			System.out.println(new ScriptEngineManager().getEngineByName("JavaScript").eval(expression));
		} catch (Exception ex) {
			try (PrintStream stream = (System.out.append("Nan"))) {
			}
		}
	}

}