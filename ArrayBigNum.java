import java.util.Scanner;
public class ArrayBigNum {
	public static void main(String []args)
	{
		int Array[] = new int[5];
		int max = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
	
		for(int i = 0; i<Array.length; i++)
		{
			
			Array[i] = scanner.nextInt();
			
		}
		max = Array[0];
		for(int i = 0; i<Array.length; i++)
		{
			if(max<Array[i]) {
				max = Array[i];
			}
			
		}
		System.out.println(max);
	}
	
}
