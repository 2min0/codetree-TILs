import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i<10; i++){
            int n = sc.nextInt();

            if (n > ans)
                ans = n;
        }

        System.out.print(ans);
    }
}