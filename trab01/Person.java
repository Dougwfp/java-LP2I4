//Douglas Willian Feu Pereira CB3005348
//João Vitor Gino CB3005488

import java.util.Scanner;

public class Person {
	Scanner s = new Scanner(System.in);
	private String name;
	private String adress;
	
	public Person(String n, String a) {
		this.name = n;
		this.adress = a;
	}
	
    public String getName() {
		return name;
	}
    
    public String getAdress() {
		return adress;
	}
    
    public void setAdress() {
    	System.out.println("Digite o seu endere�o: ");
		adress = s.next();
	}
    
	public String toString() {
		return "Person[name=" + name + ", adress=" + adress + "]";
	}
}
