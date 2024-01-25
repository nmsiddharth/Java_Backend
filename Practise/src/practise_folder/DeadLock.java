package practise_folder;

class SharedResources{
	public static final String resource1 = "pen";
	public static final String resource2 = "paper";
}

class Thread1 extends Thread{
	public void run() {
		synchronized(SharedResources.resource1) {
			System.out.println("Thread1 got pen. Waiting for Paper");
			synchronized(SharedResources.resource2) {
				System.out.println("Thread1 got paper. Task completed");
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		synchronized(SharedResources.resource1) {
			System.out.println("Thread2 got pen. Waiting for paper");
			synchronized(SharedResources.resource2) {
				System.out.println("Thread2 got paper. Task completed");
			}
		}
	}
}
public class DeadLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		
		t1.start();
		t2.start();

	}

}
