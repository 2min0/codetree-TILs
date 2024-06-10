import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[2][4];

        for (int i = 0; i<2; i++){
            for (int j = 0; j<4; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<2; i++){
            int ans = 0;
            for (int j = 0; j<4; j++){
                ans += arr[i][j];
            }
            System.out.printf("%.1f ", (double)ans/4);
        }
        System.out.println();

        for (int j = 0; j<4; j++){
            int ans = 0;
            for (int i = 0; i<2; i++){
                ans+= arr[i][j];
            }
            System.out.printf("%.1f ", (double)ans/2);
        }
        System.out.println();

        int ans = 0;
        for (int i = 0; i<2; i++){
            for (int j =0; j<4; j++){
                ans += arr[i][j];
            }
        }
        System.out.printf("%.1f ", (double)ans/8);
    }
}