import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean check = false;
        for (int i = a; i<=b; i++){
            if (i%c == 0){
                System.out.print("YES");
                check = true;
                break;
            }
        }
        if (check == false)
            System.out.print("NO");
    }
}