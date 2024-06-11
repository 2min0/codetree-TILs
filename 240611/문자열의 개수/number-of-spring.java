import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] save = new String[200];
        int cnt = 0;

        while(true){
            String str = sc.next();

            if (str.equals("0")){
                System.out.println(cnt);

                for (int i = 1; i<cnt/2; i++){
                    System.out.println(save[i]);
                }
                break;
            }

            cnt++;
            if (cnt%2 == 1)
                save[cnt] = str;
        }
    }
}