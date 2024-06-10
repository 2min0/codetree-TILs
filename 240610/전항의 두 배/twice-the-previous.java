import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d %d ", a, b);

        for (int i = 0; i<8; i++){
            int c = b + 2*a;
            System.out.printf("%d ", c);

            a = b; b = c;
        }
    }
}