import java.util.Scanner;
public class ArrayAverage {
	public static void main(String []args)
	{
		int Array[] = new int[5];
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("양수 5개를 입력하세요.");
	
		for(int i = 0; i<Array.length; i++)
		{
			
			Array[i] = scanner.nextInt();
			avg += Array[i];
		}
		System.out.println(avg/Array.length);
	}
	
}
