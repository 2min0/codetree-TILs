import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        int ans = 0;
        for (int n = start; n<=end; n++){
            int cnt = 0;

            for (int i = 1; i<n; i++){
                if (n%i == 0)
                    cnt += i;
            }

            if (cnt == n)
                ans++;
        }

        System.out.print(ans);
    }
}