import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 100;

        int prev = sc.nextInt();

        for (int i= 0; i<n-1; i++){
            int now = sc.nextInt();

            if (now - prev < ans)
                ans = now - prev;
            
            prev = now;
        }

        System.out.print(ans);
    }
}