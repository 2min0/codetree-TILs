import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new SCanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;

        for (int i = a; i<=b; i++){
            if (i%2 == 0){
                ans += i;
            }
        }
        System.out.print(ans);
    }
}