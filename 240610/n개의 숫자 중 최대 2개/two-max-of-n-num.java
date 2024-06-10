import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxVal = Integer.MIN_VALUE;
        int maxVal2 = Integer.MIN_VALUE;

        int N = sc.nextInt();

        for (int i = 0; i<N; i++){
            int n = sc.nextInt();

            if (n >= maxVal2){
                if (n >= maxVal){
                    maxVal2 = maxVal;
                    maxVal = n;
                }
                else{
                    maxVal2 = n;
                }
            }
        }

        System.out.printf("%d %d", maxVal, maxVal2);
    }
}