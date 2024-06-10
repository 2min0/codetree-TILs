import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i<=10; i++){
            int m = n * i;
            System.out.printf("%d ", m);
            if (m%5 == 0) cnt++;

            if (cnt == 2) break;
        }
    }
}