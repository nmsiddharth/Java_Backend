package practise_folder;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Siddu");
		System.out.println(sb.capacity());
		
		sb.append("Discipline");
		sb.insert(1, "hello");
		sb.replace(1, 3, "k");
		sb.delete(1, 5);
//		sb.reverse();
	System.out.println(	sb.substring(5, 8));
	
	String str = "Siddu";
	StringBuffer sb1 = new StringBuffer(str);
	System.out.println(sb1.reverse().toString());
		
		System.out.println(sb);
	}

}
