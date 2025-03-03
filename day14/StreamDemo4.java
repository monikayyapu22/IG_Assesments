package day14;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=Arrays.asList("java","jee","java","jee","jee","python");
		Map<String,Long> res=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(res);

	}

}
