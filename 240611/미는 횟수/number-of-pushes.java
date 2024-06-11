import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();

        int len = A.length();
        for (int i = 1; i<=len; i++){
            A = A.charAt(len-1) + A.substring(0, len-1);
            if (A.equals(B)){
                System.out.print(i); break;
                }
            if (i == len) System.out.print(-1);
        }    
    }
}