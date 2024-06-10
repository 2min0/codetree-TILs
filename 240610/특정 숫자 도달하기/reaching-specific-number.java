import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int cnt = 0;

        for (int i = 0; i<10; i++){
            int n = sc.nextInt();
            
            if (n>=250)
                break;

            ans += n;
            cnt++;
        }

        System.out.printf("%d %.1f", ans, (double)ans/cnt);
    }
}