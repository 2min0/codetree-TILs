import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i =0; i<n; i++){
            int m = sc.nextInt();
            System.out.printf("%d ", m * m);
        }
    }
}