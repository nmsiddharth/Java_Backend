package practise_folder;

public class P18 {

	public static void check() {
		int v = 200;
		int w = 540;
		float result = (v*4 - w)/2;
		if(w>=2 && w%2==0 && v<w) {
			System.out.println("TW = "+ result+" "+ " FW = "+ (v-result));
		}else {
			System.out.println("Invalid Input");
		}
	}
	public static void main(String[] args) {
		check();

	}

}
