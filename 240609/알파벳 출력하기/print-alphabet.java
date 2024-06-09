import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 65;

        for (int i = 0; i<n; i++){
            for (int j = 0; j<i+1; j++){
                System.out.print((char)cnt++);
                if (cnt == 65+26)
                    cnt = 65;
            }
            System.out.println();
        }
    }
}