import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for (int i = 0; i<q; i++){
            int request = sc.nextInt();

            if (request == 1){
                str = str.substring(1, str.length()) + str.charAt(0);
                System.out.println(str);
            }
            else if (request == 2){
                str = str.charAt(str.length()-1) + str.substring(0, str.length()-1);
                System.out.println(str);
            }
            else{
                String tmp = "";
                for (int j = str.length()-1; j>=0; j--){
                    tmp += str.charAt(j);
                }
                str = tmp;
                System.out.println(str);
            }
        }
    }
}