//Douglas Willian Feu Pereira CB3005348
//João Vitor Gino CB3005488

import java.util.Scanner;



public class TestStudent {

	public static void main(String[] args) {
		Student student = new Student("stefany","emailauthor@author", "program", 2010, 2);

        System.out.println(student.toString());

        student.setAdress();
        student.setProgram();
        student.setYear();
        student.setFee();
        System.out.println(student.getName());
        System.out.println(student.getAdress());
        System.out.println(student.getProgram());
        System.out.println(student.getYear());
        System.out.println(student.getFee());
	}

}