import java.util.Scanner;

public class ContinuePlus {
	public static void main(String[] args)
	{
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 5���� �Է��ϼ��� :");
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
		System.out.printf("����� ���� %d",sum);
	}
}
