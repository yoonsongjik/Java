import java.util.Scanner;
public class ArrayAverage {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int[] Array = new int[5];
		double sum = 0;
		System.out.println("���� 5���� �Է��ϼ��� : ");
		for (int i = 0; i<5; i++)
		{
			int num = scanner.nextInt();
			Array[i] = num;
			
			sum += num;
		}
		System.out.printf("%f", sum/5);
	}
}
