import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            String nextEntry = scanner.nextLine();
            try {
                int validNumber = Integer.parseInt(nextEntry);
                sum += validNumber;
                count++;
            } catch (NumberFormatException nfe) {
                break;
            }
        }
        if (count == 0) {
            System.out.println("SUM = 0 AVG = 0");
        } else {
            int avg = (int) Math.round((double) sum / count);
            System.out.println("SUM = " + sum + " AVG = " + avg);
        }
    }
}
