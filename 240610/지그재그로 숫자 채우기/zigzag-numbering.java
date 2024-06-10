import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt = 0;
        int[][] arr = new int[n][m];

        for (int j = 0; j<m; j++){
            if (j%2 == 0){
                for (int i = 0; i<n; i++){
                    arr[i][j] = cnt++;
                }
            }
                          
            else{
                for (int i = n-1; i>=0; i--){
                    arr[i][j] = cnt++;
                }
            }
        }

        for (int i = 0; i<n; i++){
            for (int j = 0; j<m; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}