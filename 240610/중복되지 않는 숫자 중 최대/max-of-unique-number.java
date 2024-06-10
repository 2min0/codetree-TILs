import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];
        int[] cnt = new int[1001];
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
            cnt[arr[i]]++;
        }

        for (int i = 0; i<N; i++){
            if (arr[i] > maxVal && cnt[arr[i]] == 1)
                maxVal = arr[i];
        }

        if (maxVal == Integer.MIN_VALUE) System.out.print(-1);
        else System.out.print(maxVal);
    }
}