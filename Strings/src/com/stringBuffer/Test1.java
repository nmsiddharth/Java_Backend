package com.stringBuffer;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghjiekslpwmv");
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer(20);
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("Java");
		System.out.println(sb2);
		sb2.append("World");
		System.out.println(sb2);
		
		sb2.insert(1, "Program");
		System.out.println(sb2);
		
		sb2.replace(1, 7, "siddu");
		System.out.println(sb2);
		
		sb2.delete(1, 10);
		System.out.println(sb2);
		
		
		System.out.println(sb2.substring(1,3));
		
		sb2.reverse();
		System.out.println(sb2);
		
		String str = "Siddu";
		StringBuffer sb3 = new StringBuffer(str);
		
		String reversedString = sb3.reverse().toString();
		System.out.println(reversedString);
		
		
		
		
		
	}

}
