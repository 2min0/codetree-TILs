import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        int n = str.indexOf("e");

        System.out.print(str.substring(0, n) + str.substring(n+1, str.length()));
    }
}