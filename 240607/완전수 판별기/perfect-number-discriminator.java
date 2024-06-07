import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = 0;
        for (int i = 1; i<= n; i++){
            if (n%i == 0){
                ans += i;
            }
        }

        if (n == ans){
            System.out.print('P');
        }
        else System.out.print('N');
    }
}