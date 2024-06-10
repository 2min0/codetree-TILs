import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];
        int cnt = 0;

        for (int i = 0; i<100; i++){
            int m = sc.nextInt();

            if (m == 0){
                cnt = i-1;
                break;
            }
            arr[i] = m;
        }

        int ans = 0;
        for (int i = 0; i<3; i++){
            ans += arr[cnt-i];
        }

        System.out.print(ans);
    }
}