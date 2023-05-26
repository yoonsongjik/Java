import java.util.Scanner;

public class ForEach {
    enum Week {��, ȭ, ��, ��, ��, ��, ��}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int k : num) {
            sum += k;
            System.out.print(k " ");
        }
        
        System.out.println("����: " + sum);
        
        String names[] = {"���", "��", "�ٳ���", "����", "����"};
        for (String s : names) {
            System.out.print(s + " ");
        }
        System.out.println("");
        for (Week day : Week.values()) {
            System.out.print(day + "���� ");
        }
        
        scanner.close();
    }
}
