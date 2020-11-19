//Douglas Willian Feu Pereira CB3005348
//João Vitor Gino CB3005488

import java.util.Scanner;

public class AuthorTeste {

	public static void main(String[] args) {
		Author author = new Author("nomeauthor","emailauthor@author",'f');

        System.out.println(author.toString());

        author.setEmail();
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
	}

}