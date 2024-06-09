import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 2; i<=n; i++){
            if (i <= 3){
                System.out.printf("%d ", i);
                continue;}
            else if (i%2 == 0) continue;

            boolean success = true;
            for (int j = 3; j<i; j++){
                if (i%j == 0){
                    success = false;
                    break;
                }
            }

            if (success) System.out.printf("%d ", i);
        }

    }
}