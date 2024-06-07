import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        boolean check = false;
        for (int i = 0; i<5; i++){
            int n = sc.nextInt();

            if (n%3 == 0) continue;

            else{
                check = true;
                System.out.print(0);
                break;
            }
        }

        if (check == false) System.out.print(1);
    }
}