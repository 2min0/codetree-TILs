import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double ans = 0;

        for (int i = 0; i<n; i++){
            ans += sc.nextDouble();
        }

        double mean = ans/n;
        System.out.printf("%.1f\n", mean);

        if (mean >= 4.0) System.out.print("Perfect");
        else if (mean >= 3.0) System.out.print("Good");
        else System.out.print("Poor");
    }
}