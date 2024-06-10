import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[10];

        while(true){
            int n = sc.nextInt();

            if (n == 0) break;

            cnt[n/10]++;
        }

        for (int i = 1; i<10; i++){
            System.out.printf("%d - %d\n", i, cnt[i]);
        }
    }
}