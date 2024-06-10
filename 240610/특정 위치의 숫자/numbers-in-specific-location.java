import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        for (int i= 0; i<10; i++){
            int m = sc.nextInt();

            if (i == 2 || i == 4 || i == 9){
                ans += m;
            }
        }

        System.out.print(ans);
    }
}