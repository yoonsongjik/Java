import java.util.Scanner;

public class WhileAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        System.out.println("������ �Է��ϰ� �������� -1�� �Է��ϼ���: ");
        int number = scanner.nextInt();

        while (number != -1) {
            sum += number;
            count++;
            number = scanner.nextInt(); // ���� �Է� ó�� �߰�
        }
        
        System.out.printf("������ ������ %d�� �̸�, ����� %f�Դϴ�.", count, (double) sum / count);
    }
}
