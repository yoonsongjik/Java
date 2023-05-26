import java.util.Scanner;

public class WhileAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int count = 0;
        System.out.println("정수를 입력하고 마지막에 -1을 입력하세요: ");
        int number = scanner.nextInt();

        while (number != -1) {
            sum += number;
            count++;
            number = scanner.nextInt(); // 정수 입력 처리 추가
        }
        
        System.out.printf("정수의 개수는 %d개 이며, 평균은 %f입니다.", count, (double) sum / count);
    }
}
