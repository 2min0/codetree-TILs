import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cnta = 0, cntb = 0, cntc = 0;

        for (int i =1; i<=n; i++){
            int a = 0, b = 0, c = 0;
            if (i%2 == 0) a = 1;
            if (i%3 == 0) b = 1;
            if (i%12 == 0) c = 1;

            if (c == 1) cntc++;
            else if (b == 1) cntb++;
            else if (a == 1) cnta++;
        }

        System.out.print(cnta + " " + cntb + " " + cntc);
    }
}