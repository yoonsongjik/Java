import java.util.Scanner;

public class Month2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month, year;

		System.out.println("�ش� ���� �Է��ϼ��� : ");
		year = scanner.nextInt();

		System.out.println("�ش� ���� �Է��ϼ��� : ");

		month = scanner.nextInt();
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
				|| (month == 12))
			System.out.println("31�ϱ��� �ֽ��ϴ�.");
		else if (month == 2)
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("29�ϱ��� �ֽ��ϴ�.");
			} else {
				System.out.println("28�ϱ��� �ֽ��ϴ�.");
			}
		else if((month == 4)||(month == 6)||(month == 9)||(month == 11))
			System.out.println("30�ϱ��� �ֽ��ϴ�");
		else
			System.out.println("�ش���� �����ϴ�");
	}
}