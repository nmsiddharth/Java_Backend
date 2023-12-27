package practise_folder;

class Car{
	static int Price;
	static String Color;
	static int Model;
	static String Name;
	
	public Car(int money,String color, int modelYr, String name) {
		Price = money;
		Color = color;
		Model = modelYr;
		Name= name;
	}
	
	public String toString() {
		return "Name : "+Name+"\nPrice : "+Price+"\nColor : "+Color+"\nModel : "+Model;
	}
}
public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car(740000,"Red",2021,"Ignis");
		System.out.println(obj);
		

	}

}
