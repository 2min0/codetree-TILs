import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[7];

        for (int i =0; i<10; i++){
            int n = sc.nextInt();

            cnt[n]++;
        }

        for (int i = 1; i<=6; i++){
            System.out.printf("%d - %d\n", i, cnt[i]);
        }
    }
}