import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i<=n; i++){
            int a = i/100;
            int b = i%100/10;
            int c = i%10;
            if (i%3 == 0)
                System.out.print(0 + " ");
            else if (a == 3 || a == 6 || a == 9 || b == 3 || b == 6 || b == 9 || c == 3 || c == 6 || c==9)
                System.out.print(0 + " ");
            else
                System.out.print(i + " ");
        }
    }
}