import java.util.Scanner;
public class ArrayBook {
	String name;
	String title;
	
	public ArrayBook(String title, String name)
	{
		this.title = title;
		this.name = name;
	}
	
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayBook[] B = new ArrayBook[2];
		
		for(int i=0; i<B.length; i++)
		{
			System.out.print("���� : ");
			String title = scanner.next();
			System.out.print("���� : ");
			String name = scanner.next();
			B[i] = new ArrayBook(title, name);
		}
		for(int i=0; i<B.length; i++)
		{
			System.out.println(B[i].title + B[i].name);
		}
		}
	
}
