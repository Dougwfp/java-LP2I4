//Douglas Willian Feu Pereira CB3005348
//João Vitor Gino CB3005488

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
        Author[] authorsArr = new Author[2];
        authorsArr[0] = new Author("Autor 01", "autor01@somewhere.com.br", 'm');
        authorsArr[1] = new Author("Autor 02", "autor02@nowhere.com.br", 'm');
        Book b = new Book("Java for Dummy",authorsArr, 19.99, 99);
        
        System.out.println(b.toString());
	}

}