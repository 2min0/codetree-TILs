import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = (int)sc.next().charAt(0);
        int B = (int)sc.next().charAt(0);

        System.out.printf("%d ", A+B);
        if (A>B) System.out.print(A-B);
        else System.out.print(B-A);
        
    }
}