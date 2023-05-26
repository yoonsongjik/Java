import java.util.Scanner;
public class ArrayMax {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[5];
		
		int max = 0;
		System.out.println("양수 5개를 입력하세요 :");
		for (int i = 0; i<5; i++) {
			int num = scanner.nextInt();
			intArray[i] = num;
			
			if(max < intArray[i])
				max = intArray[i];
			else
				continue;
		}
		System.out.printf("제일 큰 수는 %d입니다.", max);
	}
}
