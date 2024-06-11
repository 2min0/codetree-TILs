import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        while (n >= 10){
            ans += n%10;
            n/= 10;
        }

        System.out.print(ans + n);
    }
}