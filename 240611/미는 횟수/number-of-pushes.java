import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        for (int i = 1; i<=A.length(); i++){
            A = A.charAt(A.length()-1) + A.substring(0, A.length());

            if (A.equals(B)) System.out.print(i);
        }    
    }
}