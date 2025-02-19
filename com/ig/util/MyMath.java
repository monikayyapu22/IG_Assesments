package com.ig.util;

public class MyMath {

	
	public static boolean isPerfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		return sum==n;
	}
	
	public static long factorial(int n)
	{
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
	
	public static boolean isPrime(int n)
	{
		if(n<2)
		{
			return false;
		}
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static long sumOfPrimes(int n)
	{
		long sum=0;
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
			{
				sum=sum+i;
			}
		}
		return sum;
	}
	
	public static boolean isArmstrong(int n)
	{
		int original=n;
		double sum=0;
		int temp=0;
		while(original!=0)
		{
			temp++;
			original=original/10;
		}
		while(original!=0)
		{
		int digit=original%10;
		
		sum=sum+Math.pow(digit,temp);	
		original=original/10;
		}
		if(n==sum)
		{
			return true;
		}
		else {
		return false;
	}
	}
	
	public static int reverseNumber(int n)
	{
		int rev=0;
		while(n>0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}
	
	public static int binaryToDecimal(int n)
	{
		int binary=0,place=1;
		while(n>0)
		{
			binary+=(n%2)*place;
			n=n/2;
			place*=10;
		}
		return binary;
	}
	
	public static int decimalToBinary(int n)
	{
		int decimal=0,base=1;
		while(n>0)
		{
			decimal+=(n%10)*base;
			n=n/10;
			base*=2;
		}
		return decimal;
	}
	
	public static int getSumOfNFibos(int n)
	{
		int a=0,b=1,sum=a+b;
		for(int i=2;i<n;i++)
		{
			int c=a+b;
			sum=sum+c;
			a=b;
			b=c;
		}
		return sum;
	}
	
	public static boolean isPalindromeNumber(int n)
	{
		int original=n;
		int rev=0;
		while(n!=0)
		{
			int digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		if(original==rev)
		{
			return true;
		}
		return false;
	}
}

