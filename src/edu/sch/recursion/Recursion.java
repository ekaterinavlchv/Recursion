package edu.sch.recursion;

public class Recursion {

	public static void main(String[] args) {
		System.out.println(sum(5));
		System.out.println(sumOfDigits(154));
		leftToRight(1345);
		rightToLeft(1234);		
	}
	
	public static int sum(int n)
	{ 
		if(n < 1)
		{
			return n;
		}
		return n + sum(n - 1);
	}
	
	public static int sumOfDigits(int n)
	{
		if(n < 10)
		{
			return n;
		}
		
		return sumOfDigits(n/10) + sumOfDigits(n%10);
	}
	public static void leftToRight(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		leftToRight(n/10);
		System.out.println(n%10);
		
	}
	
	public static void rightToLeft(int n) 
	{
		if(n == 0)
		{
			return;
		}
		System.out.println(n%10); 
		rightToLeft(n/10); 
		
	}
	
	

	

}
