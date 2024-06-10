import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];

        int re;
        arr[0][0] = 1;
        for (int j = 1; j<m; j++){
            arr[0][j] = arr[0][j-1] + j;
        }

        int keep = 0;
        for (int j = 1; j<m; j++){
            int x = 0;
            int y = j;

            while(true){
                if (x+1 >= n || y-1 < 0) break;
                arr[x+1][y-1] = arr[x][y] + 1;
                keep = arr[x+1][y-1];
                if (++x >= n || --y < 0) break;
            }
        }

        for (int i = 1; i<n; i++){
            int x = i;
            int y = m-1;

            arr[x][y] = ++keep;

            while(true){
                if (x+1 >= n || y-1 < 0) break;
                arr[x+1][y-1] = arr[x][y] + 1;
                keep = arr[x+1][y-1];
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