package day14;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(-9,-18,0,25,4);
		Integer min=list.stream().min(Integer::compare).get();
		System.out.println("min :"+min);
		
		Integer max=list.stream().max(Integer::compare).get();
		System.out.println("max :"+max);
		
//		Stream<String>s=Stream.of("3","4","5");
//		double ans=s.collect(Collectors.averagingDouble(num->Double.parseDouble(num)));
//		System.out.println("double average: "+ans);
//		
//		Stream<String> s1=Stream.of("3","4","5");
//		double ans1=s1.collect(Collectors.averagingInt(num->Integer.parseInt(num)));
//		System.out.println("double average: "+(int)ans1);
//		-------------------------------------------------------------------------------
//		List<Integer>l2= Arrays.asList(20,30,11,18,29,10,123,198);
//		String name="insightglobal";

		List<String> pal=Arrays.asList("madam","liril","aba","tomato","apple");
		String lowestLengthPalindrome = pal.stream().filter(x-> x.equals(new StringBuilder(x).reverse().toString())).min(Comparator.comparingInt(String::length)).get();  
	    System.out.println("The lowest length palindrome is: " + lowestLengthPalindrome);
		
		
	}

}
