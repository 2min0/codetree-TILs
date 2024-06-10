import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double mean = 0;

        for (int i = 1; i<=10; i++){
            int m = sc.nextInt();

            if (i%2 == 0) sum += m;
            if (i%3 == 0) mean += m;
        }

        System.out.printf("%d %.1f", sum, mean/3);
    }
}