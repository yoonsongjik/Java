import java.util.Scanner;
public class ArrayMax {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[5];
		
		int max = 0;
		System.out.println("��� 5���� �Է��ϼ��� :");
		for (int i = 0; i<5; i++) {
			int num = scanner.nextInt();
			intArray[i] = num;
			
			if(max < intArray[i])
				max = intArray[i];
			else
				continue;
		}
		System.out.printf("���� ū ���� %d�Դϴ�.", max);
	}
}
