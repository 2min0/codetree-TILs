import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i<100; i++){
            int n = sc.nextInt();

            if (n == 999 || n== -999) break;

            if (n < minVal)
                minVal = n;
            if (n > maxVal)
                maxVal = n;
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}