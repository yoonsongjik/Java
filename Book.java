
public class Book {
	String title;
	String author;
	
	public Book()
	{
		title = "������";
		author = "���ڹ̻�";
	}
	public Book(String t, String a)
	{
		title = t; author = a;
	}
	
	public static void main(String[] args)
	{
		
		Book book = new Book("�����", "�����㺣��");
		
		System.out.print(book.title + " " +book.author);
	}
}
