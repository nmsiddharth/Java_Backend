package practise_folder;

public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Siddharth";
		String str1 = "NM";
		System.out.println(str.indexOf("h"));
		
		char[] ch = str.toCharArray();
//		for(Char data:ch) {
//			System.out.print(data+" ");
//		}
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.concat(str1));
		
		System.out.println(str.replace("i","f"));
		
		System.out.println(str.substring(2,7));
		
		String str3 = "Cristiano is The Best Athlete in the world";
		String[] arr = str3.split(" ");
		for(String ele:arr) {
			System.out.print(ele+",");
		}
		System.out.println(str.equals(str1));
	}

}
