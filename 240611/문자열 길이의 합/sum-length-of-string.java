import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cntLen = 0;
        int cntA = 0;

        for (int i = 0; i<n; i++){
            String str = sc.next();

            cntLen += str.length();
            if (str.charAt(0) == 'a')
                cntA++;
        }

        System.out.printf("%d %d", cntLen, cntA);
    }
}