import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();

        for (int i = 0; i<str.length(); i++){
            int tmp = (int)(str.charAt(i)- 'a');
            if (tmp >= 0 && tmp <= 25)
                System.out.print(str.charAt(i));
            else if (Character.isDigit(str.charAt(i)) == true)
                System.out.print(str.charAt(i));
        }
    }
}