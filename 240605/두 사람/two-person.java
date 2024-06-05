import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        char genA = sc.next().charAt(0);
        int ageB = sc.nextInt();
        char genB = sc.next().charAt(0);

        if (ageA >= 19 && genA == 'M' || ageB >= 19 && genB == 'M') System.out.print(1);
        else System.out.print(0);
    }
}