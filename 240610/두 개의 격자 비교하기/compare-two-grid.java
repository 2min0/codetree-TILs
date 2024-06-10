import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                int k = sc.nextInt();
                if (k == arr[i][j]) System.out.printf("%d ", 0);
                else System.out.printf("%d ", 1);
            }
            System.out.println();
        }

    }
}