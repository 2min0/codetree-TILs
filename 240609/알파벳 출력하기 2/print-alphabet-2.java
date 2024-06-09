import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 65;

        for (int i = 0; i<N; i++){
            for (int j = 0; j<i; j++){
                System.out.print("  ");
            }
            for (int j = 0; j<N-i; j++){
                System.out.printf("%c ", (char)cnt++);
                if (cnt == 65+26)
                    cnt = 65;
            }
            System.out.println();
        }
    }
}