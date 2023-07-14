package com.velocity.calculatorInterface;

public interface Calculator {

	public int getAddition(int a, int b);
	
	public int getSubtraction(int a, int b);
	
	public int getMultiplication(int a, int b);
	
	public int getDivision(int a, int b);
	
	public int getModulus(int a, int b);

	public void makeChoice();
	
	public int getSquare(int a);
	
	public int getCube(int a);
	
	public float getAverage(int a, int b, int c, int d, int e);
	
	public void getFactors(int a);
	
	public int getEvenOdd(int a);


}
