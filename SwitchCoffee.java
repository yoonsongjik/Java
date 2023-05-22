import java.util.Scanner;
public class SwitchCoffee {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("무슨 커피를 드릴까요?");
		
		String coffee = scanner.next();
		
		switch (coffee)
		{
		case "아메리카노":
			System.out.println("아메리카노는 2000원입니다");
			break;
		case "에스프레소":
			System.out.println("에스프레소는 3500원입니다");
			break;
		case "카푸치노":
			System.out.println("카푸치노는 3500원입니다");
			break;
		case "카페라떼":
			System.out.println("카페라떼는 3500원입니다");
			break;
		default:
			System.out.println("알수없는 커피입니다");			
		}
		
	}
}
