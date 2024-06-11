import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int ans = 0;

        String tmp = "";
        for (int i = 0; i<A.length(); i++){
            if (Character.isDigit(A.charAt(i))){
                tmp += A.charAt(i);
            }
        }
        ans += Integer.parseInt(tmp);

        tmp = "";
        for (int i = 0; i<B.length(); i++){
            if (Character.isDigit(B.charAt(i))){
                tmp += B.charAt(i);
            }
        }
        ans += Integer.parseInt(tmp);


        System.out.print(ans);
    }
}