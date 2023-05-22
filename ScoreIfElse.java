import java.util.Scanner;
public class ScoreIfElse {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = scanner.nextInt();
		System.out.println("학년을 입력하세요 :(1~4) : ");
		int grade = scanner.nextInt();
		
		if(score >= 60 && grade<4)
		{
			System.out.println("합격");
			
		}
		else if(score <= 70 && grade==4)
		{
			System.out.println("불합격!(4학년의경우 70점이상이 합격!)");
		}
		else if(score >= 70 && grade==4)
		{
			System.out.println("합격!");
		}
		else
			System.out.println("불합격!");
		
	}
}
