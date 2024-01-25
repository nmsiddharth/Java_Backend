package com.threading;

public class Garbage_Collector {

	public void finalize() {
		System.out.println("Object is garbage collected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbage_Collector gc1 = new Garbage_Collector();
		//gc1=new Garbage_Collector();
		gc1 = null;
		System.gc();

	}

}
