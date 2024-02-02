package practise_folder;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_API {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer>result = list.stream().filter(x->x%2==0).map(x->x*2).collect(Collectors.toList());
		System.out.println(result);
		
		List<String> liststr = Arrays.asList("Siddu","Sid","Siddharth","Virat");
		Stream<String> stream = liststr.stream();
		stream.filter(x->x.startsWith("Sid")).forEach(System.out::println);
		
		Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
		Integer res = stream2.reduce((a,b)->a+b).get();
		System.out.println(res);
		
		boolean result5 = liststr.stream().anyMatch(x->x.startsWith("Sid"));
		System.out.println(result5);
	}

}
