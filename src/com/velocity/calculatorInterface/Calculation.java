package com.velocity.calculatorInterface;

import java.util.Scanner;

public class Calculation implements Calculator {
	
	public int a;
	public int b;
	public int c;
	public int d;
	public int e;

	public void makeChoice(){
		char yn = 'y';
		do {
		System.out.println("1. Addition of two numbers\t\t2. Subtraction of two numbers\t\t3. Multiplication of two numbers\n4. Division of two numbers\t\t5. Modulus of two numbers\t\t6. Square of a number\n7. Cube of a number\t\t\t8. Average of numbers\t\t\t9. Factors of numbers\n10. Find out even or odd number");
		System.out.println("");
		System.out.println("Please Select the operation");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("");
		switch(number){
			case 1:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.b = scanner.nextInt();
				this.getAddition(a, b);
				break;
			case 2: 
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.b = scanner.nextInt();
				this.getSubtraction(a, b);
				break;
			case 3:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.b = scanner.nextInt();
				this.getMultiplication(a, b);
				break;
			case 4:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.b = scanner.nextInt();
				this.getDivision(a, b);
				break;
			case 5:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.b = scanner.nextInt();
				this.getModulus(a, b);
				break;
			case 6:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				this.getSquare(a);
				break;
			case 7:
				System.out.println("Enter the number ");
				this.a = scanner.nextInt();
				this.getCube(a);
				break;
			case 8:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.b = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.c = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.d = scanner.nextInt();
				System.out.println("Enter the second number ");
				this.e = scanner.nextInt();
				this.getAverage(a, b, c, d, e);
				break;
			case 9:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				this.getFactors(a);
				break;
			case 10:
				System.out.println("Enter the first number ");
				this.a = scanner.nextInt();
				this.getEvenOdd(a);
				break;
			default:
				System.out.println("Invalid Option, Please select Valid option");
		}
		System.out.println("Do you want to use another operation? Enter Y or N");
		yn = scanner.next().charAt(0);
		}while(yn == 'y');
		if (yn == 'n') {
			System.out.println("Thank you for using calculator");
		}
		
	}
	
	@Override
	public int getAddition(int a, int b) {
		System.out.println(a + b);
		return a+ b;
		
	}

	@Override
	public int getSubtraction(int a, int b) {
		System.out.println(a - b);
		return a - b;
	}

	@Override
	public int getMultiplication(int a, int b) {
		System.out.println(a * b);
		return a * b;
	}

	@Override
	public int getDivision(int a, int b) {
		System.out.println(a / b);
		return a / b;
	}

	@Override
	public int getModulus(int a, int b) {
		System.out.println(a % b);
		return a % b;
	}
	
	@Override
	public int getSquare(int a){
		System.out.println(a * a);
		return a * a;
	}
	@Override
	public int getCube(int a){
		System.out.println(a * a * a);
		return a * a * a;
	}
	@Override
	public float getAverage(int a, int b, int c, int d, int e) {
		int sum  = a + b + c + d + e;
		int avrg = sum/5;
		System.out.println(avrg);
		return avrg;
	}
	@Override
	public void getFactors(int a) {
		System.out.println("the factors of "+a+" are ");
		for(int i = 1; i<=a; i++) {
			if(a%i == 0) {
				System.out.println(i);
			}
		}
		
	}
	@Override
	public int getEvenOdd(int a) {
		if(a%2 == 0) {
		System.out.println(+a+" is even number");
		}
		else {
			System.out.println(+a+" is odd number");
		}
		return a * a * a;
	}
	
}
