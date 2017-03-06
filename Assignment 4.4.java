
public class ConstructorChaining {
	ConstructorChaining(){
		System.out.println("Default Constructor");
	}
	ConstructorChaining(int i){
		this();
		System.out.println("Single Parameterized constructor");
	}
	ConstructorChaining(int i, int j){
		this(j);
		System.out.println("Double Parameterized constructor");
	}
	public static void main(String[] args){
		ConstructorChaining c = new ConstructorChaining(2,2);
		
	}

}
