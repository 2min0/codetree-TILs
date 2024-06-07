import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean check = false;

        for (int i = a; i<=b; i++){
            if (1920%i ==0 && 288-%i == 0){
                check = true;
                System.out.print(1);
                break;
            }
        }

        if (check == false){
            System.out.print(0);
        }
    }
}