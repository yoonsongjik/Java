import java.util.Scanner;

public class ContinuePlus {
	public static void main(String[] args)
	{
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요 :");
		for (int i = 0; i<5; i++)
		{
			int num = scanner.nextInt();
			if(num > 0)
			{
				sum += num;
			}
			else
				continue;
			
		}
		System.out.printf("양수의 합은 %d",sum);
	}
}
