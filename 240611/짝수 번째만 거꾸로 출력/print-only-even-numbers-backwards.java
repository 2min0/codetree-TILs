import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = "";

        for (int i = 0; i<str.length(); i++){
            if (i%2 == 1){
                str2 += str.charAt(i);
            }
        }

        for (int i = str2.length()-1; i>=0; i--)
            System.out.print(str2.charAt(i));
    }
}