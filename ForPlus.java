
public class ForPlus {
	public static void main(String[] args)
	{
		int sum=0;
		
		for(int i = 1; i<11; i++)
		{
			System.out.print(i + "+");
			sum += i;
		}
		System.out.printf("=" + sum);
	}
}
