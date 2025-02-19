package com.ig.ui;
import com.ig.util.MyMath;
public class MyMathDemo {

	public static void main(String[] args) {
		System.out.println("28 a perfect number? " +MyMath.isPerfectNumber(28));
		System.out.println("factorial of 100 is "+MyMath.factorial(100));
		System.out.println("is 7 prime? "+MyMath.isPrime(7));
		System.out.println("sum of primes upto 10 is"+MyMath.sumOfPrimes(10));
		System.out.println("is 153 armstrong number? "+MyMath.isArmstrong(153));
		System.out.println("reverse of 1234567 is "+MyMath.reverseNumber(1234567));
		System.out.println("binary of 10 is: "+MyMath.binaryToDecimal(10));
		System.out.println("decimal of 1010 is : "+MyMath.binaryToDecimal(1010));
		System.out.println("sum of first 10 fibonacci numbers "+MyMath.getSumOfNFibos(10));
		System.out.println("is 12344321 a palindrome? "+MyMath.isPalindromeNumber(12344321));
	}

}
