import java.util.Scanner;

public class WhileExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("���ڿ��� �Է��ϼ��� (exit�� ����): ");
            String input = scanner.nextLine();
            
            if (input.equals("exit")) {
                System.out.println("���α׷��� �����մϴ�.");
                break;
            }
            
            System.out.println("�Է��� ���ڿ�: " + input);
        }
    }
}
