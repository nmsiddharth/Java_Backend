package practise_folder;

class Simple{
	int principle;
	int rate;
	int time;
	
	public Simple(int principle, int rate, int time){
		this.principle = principle;
		this.rate = rate;
		this.time = time;
	}
	
	public void operation() {
//		return (principle*rate*time)/100;
		System.out.println((this.principle*this.rate*this.time)/100);
	}
	
	
}
public class ThisSI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple obj = new Simple(1000,10,2);
//		float result = obj.operation();
//		System.out.println(result);
		obj.operation();

	}

}
