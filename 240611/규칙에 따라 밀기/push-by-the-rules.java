import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.next();
        String B = sc.next();
        
        for (int i= 0; i<B.length(); i++){
            if (B.charAt(i) == 'L'){
                A = A.substring(1, A.length()) + A.charAt(0);
            }
            else{
                A = A.charAt(A.length()-1) + A.substring(0, A.length()-1);
            }
        }

        System.out.print(A);
    }
}