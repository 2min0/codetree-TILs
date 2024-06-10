import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        int i = 0;

        while(i < 10){
            int n = sc.nextInt();
            if (n==0){
                i--;
                break;
            }

            arr[i++] = n;
        }

        for (int j = i; j>=0; j--){
            System.out.printf("%d ", arr[j]);
        }
    }
}