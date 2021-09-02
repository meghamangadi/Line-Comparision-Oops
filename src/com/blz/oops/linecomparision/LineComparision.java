package com.blz.oops.linecomparision;

import java.util.Scanner;

public class LineComparision {
	public static int x1, x2, y1, y2;
	public static double distance;

	public static void main(String[] args) {

		welcome();
		userInput();
		distance();
	}

	static void welcome() {
		System.out.println("Welcome to Line Comparsion Computation Program");
	}

	public static void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of X1");
		x1 = sc.nextInt();

		System.out.println("Enter the value of X2");
		x2 = sc.nextInt();

		System.out.println("Enter the value of Y1");
		y1 = sc.nextInt();

		System.out.println("Enter the value of Y2");
		y2 = sc.nextInt();
	}

	public static void distance() {
		distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		System.out.println("Length of a line : " + +distance);
	}

}