import java.util.Scanner;
public class OX {
	public static void main(String [] args)
	{
		int time;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("최대 증가 수를 입력하세요 :");
		
		time = scanner.nextInt();
		
		
		for (int i = 0; i<time; i+=2)
		{
			for(int j=time-2; j>=i; j-=2)
			{
				System.out.print("X");
			}
			for(int k=0; k<=i; k++)
			{
				System.out.print("O");
			}
			for(int j=time-2; j>=i; j-=2)
			{
				System.out.print("X");
			}
			System.out.println();
		}
		for (int i = 0; i<time-2; i+=2)
		{	
			for(int j = 0; j<=i; j+=2)
			{
				System.out.print("X");
			}
			for(int k=time-2; k>i; k--)
			{
				System.out.print("O");
			}
			for(int j = 0; j<=i; j+=2)
			{
				System.out.print("X");
			}
			System.out.println();
		}
	}
}