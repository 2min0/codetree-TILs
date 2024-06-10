import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;

        for (int ii = 0; ii<n; ii++){
            double mean = 0;
            for (int i = 0; i<4; i++){
                mean += sc.nextInt();
            }

            if (mean/4 >= 60){
                System.out.println("pass");
                cnt++;
            }
            else{
                System.out.println("fail");
            }
        }

        System.out.print(cnt);
    }
}