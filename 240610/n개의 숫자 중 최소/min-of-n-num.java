import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        int minVal = Integer.MAX_VALUE;
        int minCnt = 0;

        for (int i = 0; i<N; i++){
            int n = sc.nextInt();

            if (n < minVal){
                minVal = n;
                minCnt = 1;
            }
            else if (n == minVal)
                minCnt++;
        }

        System.out.printf("%d %d", minVal, minCnt);
    }
}