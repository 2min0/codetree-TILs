import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        int cnt = 0;

        for (int i = 0; i<A.length(); i++){
            if (Character.isDigit(A.charAt(i)) == false)
                cnt += Integer.parseInt(A.substring(0, i));
        }
        for (int i = 0; i<B.length(); i++){
            if (Character.isDigit(B.charAt(i)) == false)
                cnt += Integer.parseInt(B.substring(0, i));
        }
        System.out.print(cnt);
    }
}