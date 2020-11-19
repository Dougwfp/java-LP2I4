//Douglas Willian Feu Pereira CB3005348
//João Vitor Gino CB3005488

import java.util.Scanner;

public class Student extends Person {
	Scanner s = new Scanner(System.in);
	private String program;
	private int year;
	private double fee;


	public Student(String n, String a, String program, int year, double fee) {
		super(n, a);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram() {
		System.out.println("Digite o programa: ");
		program = s.next();
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear() {
		System.out.println("Digite o ano: ");
		year = s.nextInt();
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee() {
		System.out.println("Digite a taxa");
		fee = s.nextDouble();
	}
	
	public String toString() {
		return "Student[Person[name=" + getName() + ", adress=" + getAdress() + "], program=" + program + ", year=" + year + ", fee=" + fee + "]";
	}
}
