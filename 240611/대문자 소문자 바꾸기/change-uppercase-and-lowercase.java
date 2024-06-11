import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i<str.length(); i++){
            char tmp = str.charAt(i);
            String t = String.valueOf(tmp);

            if (Character.isUpperCase(tmp)){
                System.out.print(t.toLowerCase());
            }
            else if(Character.isLowerCase(tmp))
                System.out.print(t.toUpperCase());
        }
    }
}