import java.util.Scanner;
public class SwitchCoffee {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� Ŀ�Ǹ� �帱���?");
		
		String coffee = scanner.next();
		
		switch (coffee)
		{
		case "�Ƹ޸�ī��":
			System.out.println("�Ƹ޸�ī��� 2000���Դϴ�");
			break;
		case "����������":
			System.out.println("���������Ҵ� 3500���Դϴ�");
			break;
		case "īǪġ��":
			System.out.println("īǪġ��� 3500���Դϴ�");
			break;
		case "ī���":
			System.out.println("ī��󶼴� 3500���Դϴ�");
			break;
		default:
			System.out.println("�˼����� Ŀ���Դϴ�");			
		}
		
	}
}
