import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        if (a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }

        for (int i = a; i<=b; i++){
            if (i%5 == 0){
                ans += i;
            }
        }
        System.out.print(ans);
    }
}