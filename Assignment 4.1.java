//protected access modifier
//1st package
package pack;

public class Package {
	protected void msg(){
			System.out.println("Hello World");
		}
	}

//2nd package
package myPack;
import pack.*;

class Package1 extends Package{
	public static void main(String[] args){
		Package1 a = new Package1();
		a.msg();
	}
}
