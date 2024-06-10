import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prev = sc.nextInt();

        for (int i = 0; i<9; i++){
            int cur = sc.nextInt();

            if (cur % 3 == 0)
                break;

            prev = cur;
        }

        System.out.print(prev);
    }
}