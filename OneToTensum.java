import java.util.Scanner;

public class OneToTensum {
	public static void main(String []args)
	{
		Scanner scanner = new Scanner(System.in);
		int time, twin, third; 
		int sum=0;
		System.out.println("¹Ýº¹ È½¼ö¸¦ ÀÔ·ÂÇÏ¼¼¿ä :");
		time = scanner.nextInt();
	for (int i = 1; i<=time; i++)
		{
			if(i%2 == 1)
			{	
				twin = i*i;
				sum +=twin;
				System.out.println("È¦¼ö" + i + "ÀÇ Á¦°öÀº : " + twin);
			}
			else
			{	
				third = i*i*i;
				sum += third;
				System.out.println("Â¦¼ö" + i + "ÀÇ ¼¼Á¦°öÀº : " + third);
			}
			
		}
	System.out.println("ÃÑ ÇÕÀº : " + sum);
	}
}
