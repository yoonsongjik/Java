import java.util.Scanner;
public class ScoreIfElse {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���(0~100) : ");
		int score = scanner.nextInt();
		System.out.println("�г��� �Է��ϼ��� :(1~4) : ");
		int grade = scanner.nextInt();
		
		if(score >= 60 && grade<4)
		{
			System.out.println("�հ�");
			
		}
		else if(score <= 70 && grade==4)
		{
			System.out.println("���հ�!(4�г��ǰ�� 70���̻��� �հ�!)");
		}
		else if(score >= 70 && grade==4)
		{
			System.out.println("�հ�!");
		}
		else
			System.out.println("���հ�!");
		
	}
}
