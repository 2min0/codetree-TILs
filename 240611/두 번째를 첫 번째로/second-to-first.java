import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char first = str.charAt(0);
        char second = str.charAt(1);

        char[] ss = str.toCharArray();

        for (int i = 0; i<ss.length; i++){
            if (ss[i] == second)
                ss[i] = first;
        }

        System.out.print(String.valueOf(ss));

    }
}