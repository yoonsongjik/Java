public class WhilePlus {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        String equation = "";

        while (i <= 10) {
            equation += i;
            sum += i;

            if (i < 10) {
                equation += " + ";
            } else {
                equation += " = ";
            }

            i++;
        }

        System.out.println(equation + sum);
    }
}
