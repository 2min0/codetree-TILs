import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i<=10; i++){
            if (i%2 == 1){
                sum1 += sc.nextInt();
            }
            else{
                sum2 += sc.nextInt();
            }
        }

        int ans = sum1 - sum2;

        if (ans >= 0) System.out.print(ans);
        else System.out.print(-ans);
    }
}