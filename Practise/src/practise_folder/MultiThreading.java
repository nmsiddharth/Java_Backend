package practise_folder;

class My implements Runnable{
	public void print() {
		System.out.println("Sid");
	}
	@Override
	public void run() {
		print();
	}
}
public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My t1 = new My();
		Thread th = new Thread(t1);
		th.start();

	}

}
