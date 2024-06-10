import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] cnt = new int[4];

        for (int i = 0; i<3; i++){
            char a = sc.next().charAt(0);
            int b = sc.nextInt();

            if (a == 'Y'){
                if (b>=37) cnt[0]++;
                else cnt[2]++;
            }
            else{
                if (b>=37) cnt[1]++;
                else cnt[3]++;
            }
        }

        for (int i = 0; i<4; i++)
            System.out.printf("%d ", cnt[i]);

        if (cnt[0] >=2) System.out.print('E');
    }
}