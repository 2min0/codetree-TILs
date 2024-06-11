import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum= 0;
        for (int i = 0; i<n; i++){
            sum += sc.nextInt();
        }

        String num = Integer.toString(sum);

        System.out.print(num.substring(1, num.length())+ num.charAt(0));
    }
}