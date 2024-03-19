package practise_folder;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

	public static void check(int target,int[]arr) {
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			
			int compliment = target - arr[i];
			
			if(map.containsKey(compliment)) {
				int index1 = map.get(compliment);
				int index2 = i;
				System.out.println(index1+","+index2);
			}
			
			 map.put(arr[i], i);
		}
		
	}
	public static void main(String[] args) {
		int [] arr = {16,4,23,8,15,42,1,2};
		int target = 19;
		 Two_Sum.check(target, arr);

		//System.out.println(Arrays.toString(result));
//        if (result != null) {
//            System.out.println("Indices: " + result[0] + ", " + result[1]);
//        } else {
//            System.out.println("No such pair found.");
//        }
		

	}

}
