import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[11];

        for (int i = 0; i<100; i++){
            int n = sc.nextInt();
            if (n == 0) break;

            cnt[n/10]++;
        }

        for (int i = 10; i>=1; i--){
            System.out.printf("%d - %d\n", i*10, cnt[i]);
        }
    }
}