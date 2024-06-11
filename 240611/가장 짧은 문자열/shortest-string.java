import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

        int lenA = a.length();
        int lenB = b.length();
        int lenC = c.length();

        int lenMax = 0;
        int lenMin = 0;

        if (lenA >= lenB && lenA >= lenC) lenMax = lenA;
        else if (lenA <= lenB && lenB >= lenC) lenMax = lenB;
        else lenMax = lenC;
        if (lenA <= lenB && lenA <= lenC) lenMin = lenA;
        else if (lenA >= lenB && lenB <= lenC) lenMin = lenB;
        else lenMin = lenC;


        System.out.print(lenMax - lenMin);
    }
}