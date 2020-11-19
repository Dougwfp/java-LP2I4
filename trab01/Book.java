//Douglas Willian Feu Pereira CB3005348
//João Vitor Gino CB3005488

import java.util.Scanner;

public class Book {

	Scanner s = new Scanner(System.in);
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;
    
	public Book(String n, Author[] a, double p) {

        this.name = n;
        this.authors = a;
        this.price = p;
		
    }

    public Book(String n, Author[] a, double p, int q) {

        this.name = n;
        this.authors = a;
        this.price = p;
		this.qty = q;
    }


    public String getName() {
		return name;
	}
    
    public double getPrice() {
		return price;
    }
    
    public void setPrice(double p) {
		price = p;
    }    
    
    public int getQty() {
		return qty;
    }

    public void setQty(int q) {
		qty = q;
    }    
     
	
	public String toString() {
        String arrAuthor = "{";
        for(int i = 0; i < authors.length; i++){
            arrAuthor = arrAuthor + authors[i].toString();
        }
        arrAuthor = arrAuthor + "}";

		return "Book[name=" + name + ", author=" + arrAuthor + ", price=" + price+ ", qty=" + qty +"]";
	}
		
	public static void main(String[] args) {
    
    }

}