import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String before = sc.next();
        char prev = before.charAt(0);
        int cnt = 1;
        String after = "";

        for (int i = 1; i<before.length(); i++){
            if (before.charAt(i) == prev){
                cnt++;
            }

            else{
                after += prev;
                after += cnt;

                prev = before.charAt(i);
                cnt = 1;
            }
        }

        after += prev;
        after += cnt;

        System.out.println(after.length());
        System.out.print(after);

    }
}