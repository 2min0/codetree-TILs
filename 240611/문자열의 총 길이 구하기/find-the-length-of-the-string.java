import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        for (int i = 0; i<10; i++){
            String str = sc.next();
            cnt += str.length();
        }

        System.out.print(cnt);
    }
}