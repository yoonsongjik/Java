import java.util.Scanner;
public class ArrayReturn {
	public static int[] makeArray() {
		int Array[] = new int[4];
		
		for(int i = 0; i< Array.length; i++)
		{
			Array[i] = i+1;
		}
		return Array;
	}
	
	
	public static void main(String []args)
	{
		int Array[];
		
		Array = makeArray();
		for(int i = 0; i<Array.length; i++)
		{
			System.out.println(Array[i]);
		}
		
	}

}
