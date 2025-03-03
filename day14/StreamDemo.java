package day14;
//import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(12,123,145,160,15,16,34,56,78,89,78,67);
		list.parallelStream().filter(x->x>100).filter(x->x%2!=0).limit(2).forEach(x->System.out.println(x));
		Stream<String> s =Stream.of("java","python","rest","hehehehe");
		s.filter(ss->ss.length()!=8).forEach(System.out::println);
	}

}
