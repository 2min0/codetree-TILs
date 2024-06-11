import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        while(A.contains(B) == true){
            int n = A.indexOf(B);
            A = A.substring(0, n) + A.substring(n+B.length(), A.length());
        }

        System.out.print(A);
    }
}