import java.util.Scanner;

public class OneToTensum {
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int time, twin, third; 
		int sum=0;
		System.out.println("�ݺ� Ƚ���� �Է��ϼ��� :");
		time = scanner.nextInt();
	for (int i = 1; i<=time; i++)
		{
			if(i%2 == 1)
			{	
				twin = i*i;
				sum +=twin;
				System.out.println("Ȧ��" + i + "�� ������ : " + twin);
			}
			else
			{	
				third = i*i*i;
				sum += third;
				System.out.println("¦��" + i + "�� �������� : " + third);
			}
			
		}
	System.out.println("�� ���� : " + sum);
	}
}
