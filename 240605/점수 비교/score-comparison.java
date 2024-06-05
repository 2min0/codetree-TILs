import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mathA = sc.nextInt();
        int engA = sc.nextInt();
        int mathB = sc.nextInt();
        int engB = sc.nextInt();

        if (mathA > mathB && engA > engB) System.out.print(1);
        else System.out.print(0);
    }
}