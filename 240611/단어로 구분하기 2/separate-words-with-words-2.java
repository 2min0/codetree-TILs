import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i<=10; i++){
            String str = sc.next();

            if (i%2 == 1)
                System.out.println(str);
        }
    }
}