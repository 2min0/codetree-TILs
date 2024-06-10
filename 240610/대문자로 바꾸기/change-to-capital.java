import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i<5; i++){
            for (int j = 0; j<3; j++){
                char a = sc.next().charAt(0);

                System.out.printf("%c ", (char)(a-32));
            }
            System.out.println();
        }
    }
}