import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toUpperCase();

        for (int i = 0; i<str.length(); i++){
            if (65 <= (int)str.charAt(i) && (int)str.charAt(i) <= 91)
                System.out.print(str.charAt(i));
        }
    }
}