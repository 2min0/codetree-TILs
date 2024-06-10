import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maxVal = 0;
        int minVal = 1001;
        for (int i = 0; i<10; i++){
            int n = sc.nextInt();

            if (n<500){
                if (n>maxVal) maxVal = n;
            }
            else{
                if (n < minVal) minVal = n;
            }
        }

        System.out.printf("%d %d", maxVal, minVal);
    }
}