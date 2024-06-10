import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<100; i++){
            int n = sc.nextInt();

            if (n == 0) break;

            if (n%2 == 1) System.out.printf("%d ", n+3);
            else System.out.printf("%d ", n/2);
        }
    }
}