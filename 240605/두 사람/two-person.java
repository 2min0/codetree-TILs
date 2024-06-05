import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ageA = sc.nextInt();
        String genA = sc.next();
        int ageB = sc.nextInt();
        String genB = sc.next();

        if (ageA >= 19 && genA == "M" || ageB >= 19 && genB == "M") System.out.print(1);
        else System.out.print(0);
    }
}