import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.next();
        String str2 = sc.next();

        int lenStr1 = str1.length();
        int lenStr2 = str2.length();

        if (lenStr1 == lenStr2) System.out.print("same");
        else if (lenStr1 > lenStr2) System.out.printf("%s %d", str1, lenStr1);
        else System.out.printf("%s %d", str2, lenStr2);

    }
}