import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char a = sc.next().charAt(0);

        int cnt = 0;
        for (int i = 0; i<str.length(); i++){
            if (a == str.charAt(i)) cnt++;
        }

        System.out.print(cnt);
    }
}