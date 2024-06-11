import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cnt = 0;
        String A = sc.next();

        for (int i = 0; i<A.length(); i++){
            if (Character.isDigit(A.charAt(i)) == true){
                cnt += A.charAt(i) - '0';
            }
        }
        System.out.print(cnt);
    }
}