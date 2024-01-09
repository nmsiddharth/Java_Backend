package practise_folder;

interface Cars{
	void getName();
}

class Audi implements Cars{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("Audi");
	}
	
}
class BMW implements Cars{

	@Override
	public void getName() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
		
	}
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars obj = new BMW();
		obj.getName();

	}

}
