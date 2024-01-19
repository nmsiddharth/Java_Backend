package practise_folder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list = new ArrayList<>();
		
		// Insertion
		list.add(11);
		list.add(2);
		list.add(31);
		
		//System.out.println(list);
		int [] arr = list.stream().mapToInt(Integer::intValue).toArray();
		System.out.println(Arrays.toString(arr));
		
		System.out.println(list.get(1));
		

	}

}
