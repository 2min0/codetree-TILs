import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char a1 = sc.next().charAt(0);
        int a2 = sc.nextInt();
        char b1 = sc.next().charAt(0);
        int b2 = sc.nextInt();
        char c1 = sc.next().charAt(0);
        int c2 = sc.nextInt();

        int cnt = 0;
        if (a1 == 'Y' && a2 >= 37) cnt += 1;
        if (b1 == 'Y' && b2 >= 37) cnt += 1;
        if (c1 == 'Y' && c2 >= 37) cnt += 1;

        if (cnt >= 2) System.out.print('E'); else System.out.print('N');
    }
}