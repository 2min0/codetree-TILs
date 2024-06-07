import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = 0;
        int cnt = 0;
        while(true){
            int n = sc.nextInt();

            if (20<=n && n<30){
                ans += n;
                cnt++;
            }
            else{
                System.out.printf("%.2f", (double)ans/cnt);
                break;
            }
        }
    }
}