import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i<=100; i++){
            ans += i;
            if (ans >=n){
                System.out.print(i);
                break;
            }
        }
    }
}