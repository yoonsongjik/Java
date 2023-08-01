import java.util.Scanner;
public class OX2 {
	public static void main(String [] args)
	{
		
		int time;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("최대 증가 수를 입력하세요 :");
		
		time = scanner.nextInt();
		
		for (int i = time; i>0; i--)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("X");
			}
			for(int k = i*2-1; k>0; k--)
			{
				System.out.print("O");
			}
			System.out.println();
		}
	}
}
