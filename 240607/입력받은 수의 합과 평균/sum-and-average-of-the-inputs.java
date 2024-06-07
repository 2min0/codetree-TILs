import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); int ans = 0;

        for (int i = 0; i<n; i++){
            int x = sc.nextInt();

            ans += x;
        }

        System.out.printf("%d %.1f", ans, (double)ans/n);
    }
}