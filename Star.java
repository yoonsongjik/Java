import java.util.Scanner;

public class Star {
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int line;
		
		System.out.println("줄 수를 입력하세요 : ");
		line = scanner.nextInt();
		
		for(int i = 1; i<= line; i++)
		{	
			for(int j=1;j <=i *2-1;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
