import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�̸�, ����, ����, ü��, ���ſ��θ� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");

        String name = scanner.next();
        String city = scanner.next();
        int age = scanner.nextInt();
        double weight = scanner.nextDouble();
        boolean isSingle = scanner.nextBoolean();

        System.out.println("�̸�: " + name);
        System.out.println("����: " + city);
        System.out.println("����: " + age);
        System.out.println("ü��: " + weight);
        System.out.println("���ſ���: " + isSingle);

        scanner.close();
    }
}
