package fa.training.assignment1;

import java.util.Scanner;

public class Assignment {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ex1");
		ArithmeticExercise1();
		System.out.println("\n--------------------\n");
		
		System.out.println("Ex2");
		ArithmeticExercise2();
		System.out.println("\n--------------------\n");

		System.out.println("Ex3");
		JavaExercise();

		System.out.println("\n--------------------\n");
		System.out.println("Ex4");
		ArithmeticExercise3();

		System.out.println("\n--------------------\n");
		System.out.println("Ex5");
		CircleExercise();

		System.out.println("\n--------------------\n");
		System.out.println("Ex6");
		RectangleExercise();

		System.out.println("\n--------------------\n");
		System.out.println("Ex7");
		LogicalExercise();
	}

	public static void ArithmeticExercise1() {
		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);
		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
	}

	public static void ArithmeticExercise2() {
		System.out.print("Input first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Input second number: ");
		int secondNum = sc.nextInt();
		System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
		System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
		System.out.println(firstNum + " * " + secondNum + " = " + firstNum * secondNum);
		System.out.println(firstNum + " / " + secondNum + " = " + firstNum / secondNum);
		System.out.println(firstNum + " % " + secondNum + " = " + firstNum % secondNum);
	}

	public static void JavaExercise() {
		System.out.println("J    a   v     v  a\n" + "   J   a a   v   v  a a\n" + "J  J  aaaaa   V V  aaaaa\n"
				+ " JJ  a     a   V  a     a");
	}

	public static void ArithmeticExercise3() {
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
	}

	public static void CircleExercise() {
		System.out.print("Radius = ");
		double radius = sc.nextDouble();
		System.out.println("Perimeter is = " + 2 * radius * Math.PI);
		System.out.println("Area is = " + radius * radius * Math.PI);
	}

	public static void RectangleExercise() {
		System.out.print("Wdtdh = ");
		double width = sc.nextDouble();
		System.out.print("Height = ");
		double height = sc.nextDouble();
		System.out.println("Area is = " + width + " * " + height + " = " + width * height);
		System.out.println("Perimeter is = 2*(" + width + " * " + height + ") = " + (2 * (width + height)));
	}

	public static void LogicalExercise() {
		System.out.print("Input first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Input second number: ");
		int secondNum = sc.nextInt();
		if (firstNum == secondNum) {
			System.out.println(firstNum + " == " + secondNum);
		} else {
			System.out.println(firstNum + " != " + secondNum);

		}
		if (firstNum < secondNum) {
			System.out.println(firstNum + " < " + secondNum);
		} else {
			System.out.println(firstNum + " > " + secondNum);

		}
		if (firstNum <= secondNum) {
			System.out.println(firstNum + " <= " + secondNum);
		} else {
			System.out.println(firstNum + " >= " + secondNum);

		}
	}
}
