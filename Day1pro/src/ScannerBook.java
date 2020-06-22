import java.util.Scanner;
class MyBook{
	
	private String title;
	private String author;
	
	public MyBook(){
		this.title = title;
		this.author = author;
	}
	
	
	public void setTitle(String title) {		
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	
	
	void showBookDetails(){
		System.out.println(title + "\t" + author);
	}	
	
}

public class ScannerBook {

	public static void main(String[] args) {
	MyBook book=new MyBook();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the book title: ");
		String title=sc.nextLine();
		System.out.println("enter the author name: ");
		String author=sc.nextLine();
		book.setTitle(title);
		book.setAuthor(author);
		System.out.println("Author is "+book.getAuthor());
		System.out.println("My book  is "+book.getTitle());
		
		
		
		

	}

}
