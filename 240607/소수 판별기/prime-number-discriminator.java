import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        boolean check = false;
        for (int i = 2; i<n;i++){
            if (n%i == 0){
                System.out.print('C');
                check = true;
                break;
            }
        }

        if (check == false)
            System.out.print('P');
    }
}