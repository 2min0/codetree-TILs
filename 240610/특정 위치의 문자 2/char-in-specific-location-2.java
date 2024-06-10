import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=10; i++){
            char m = sc.next().charAt(0);

            if (i == 2 || i == 5 || i == 8)
                System.out.printf("%c ", m);
        }
    }
}