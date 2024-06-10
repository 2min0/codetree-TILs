import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        int prevIdx = N;
        int nowIdx = N;

        while(prevIdx != 0){
            int maxVal = Integer.MIN_VALUE;

            for (int i = 0; i<prevIdx; i++){
                if (arr[i] > maxVal){
                    maxVal = arr[i];
                    nowIdx = i;
                }
            }
            System.out.printf("%d ", nowIdx+1);
            prevIdx = nowIdx;
        }
    }
}