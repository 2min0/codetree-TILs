import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        
        int cnt = 0;
        for (int j = 0; j<m; j++){
            int x = 0;
            int y = j;

            arr[x][y] = ++cnt;

            while(true){
                if (x+1 >= n || y-1 < 0) break;
                arr[x+1][y-1] = arr[x][y] + 1;
                cnt = arr[x+1][y-1];
                if (++x >= n || --y < 0) break;
            }
        }

        for (int i = 1; i<n; i++){
            int x = i;
            int y = m-1;

            arr[x][y] = ++cnt;

            while(true){
                if (x+1 >= n || y-1 < 0) break;
                arr[x+1][y-1] = arr[x][y] + 1;
                cnt = arr[x+1][y-1];
                if (++x >= n || --y < 0) break;
            }
        }

        for (int i = 0; i<n; i++){
            for (int j= 0; j<m; j++){
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
        
    }

}