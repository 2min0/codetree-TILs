import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        String str = "";

        str = A.substring(0, 2) + B.substring(2);

        System.out.print(str);
    }
}