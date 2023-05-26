import java.util.Scanner;

public class ArrayAverage2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        int grade[][] = new int[4][2];

        for (int year = 0; year < 4; year++) {
            for (int half = 0; half < 2; half++) {
                System.out.printf("%d 학년 %d 학기 점수: ", year + 1, half + 1);
                int score = scanner.nextInt();
                grade[year][half] = score;
                count++;
                sum += grade[year][half];
            }
        }
        
        for (int year = 0; year < grade.length; year++) {
            for (int half = 0; half < grade[year].length; half++) {
                System.out.printf("%d 학년 %d 학기 점수: %d ", year + 1, half + 1, grade[year][half]);
            }
            System.out.println("");
        }
        
        double average = sum / count;
        System.out.printf("4년동안 평균은: %.2f", average);
    }
}
