import java.util.Scanner;

public class Month2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month, year;

		System.out.println("해당 년을 입력하세요 : ");
		year = scanner.nextInt();

		System.out.println("해당 월을 입력하세요 : ");

		month = scanner.nextInt();
		if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10)
				|| (month == 12))
			System.out.println("31일까지 있습니다.");
		else if (month == 2)
			if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
				System.out.println("29일까지 있습니다.");
			} else {
				System.out.println("28일까지 있습니다.");
			}
		else if((month == 4)||(month == 6)||(month == 9)||(month == 11))
			System.out.println("30일까지 있습니다");
		else
			System.out.println("해당월이 없습니다");
	}
}