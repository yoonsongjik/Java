
public class Book {
	String title;
	String author;
	
	public Book()
	{
		title = "춘향전";
		author = "작자미상";
	}
	public Book(String t, String a)
	{
		title = t; author = a;
	}
	
	public static void main(String[] args)
	{
		
		Book book = new Book("어린왕자", "생택쥐베리");
		
		System.out.print(book.title + " " +book.author);
	}
}
