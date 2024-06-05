import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();

        if (b%2 == 1) b--;

        while (b>=a){
            System.out.print(b + " ");
            b-= 2;
        }
    }
}