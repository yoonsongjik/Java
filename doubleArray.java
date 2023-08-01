import java.util.Scanner;
public class doubleArray {
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int Array[][] = new int[4][2];
		double avg = 0;
		
		for(int i = 0; i<Array.length; i++)
		{
			for(int j = 0; j<Array[i].length; j++)
			{
				Array[i][j] = scanner.nextInt();
			}
		}
		
		
		for(int[] i : Array)
		{
			for(int j : i)
			{
				avg += j;
			}
		}
		System.out.println(avg/(Array.length*Array[0].length));
	}
	
}
