import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        while(str.length() > 1){
            int n = sc.nextInt();

            if (n >= str.length())
                str = str.substring(0, str.length()-1);
            else
                str = str.substring(0, n) + str.substring(n+1, str.length());

            System.out.println(str);
        }
    }
}