
public class Overriding {
	public static void main(String[] arg){
		A a = new A();
		a.test();
	}

}

class C{
	void test(){
		System.out.println("Method is invoked.");
	}
}

class B extends C{
	
}

class A extends B{
	
}

// a.test();