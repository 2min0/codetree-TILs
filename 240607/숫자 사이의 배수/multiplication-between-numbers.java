import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int ans = 0;
        int cnt = 0;

        for (int i = a; i<=b; i++){
            if (i %5==0 || i%7 == 0) {
                ans += i;
                cnt++;
            }
        }

        System.out.print(ans + " ");
        System.out.printf("%.1f", (double)ans/cnt);
    }
}