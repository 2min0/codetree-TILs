import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 1;
        int b = sc.nextInt();

        System.out.printf("%d %d ", a, b);

        while(true){
            int c = a+b;
            System.out.printf("%d ", c);

            if (c > 100) break;
            a = b; b = c;
        }


    }
}