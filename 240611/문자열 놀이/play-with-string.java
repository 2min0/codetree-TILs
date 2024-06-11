import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] ss = s.toCharArray();
        int q = sc.nextInt();

        for (int i = 0; i<q; i++){
            int type = sc.nextInt();

            if (type == 1){
                int a = sc.nextInt();
                int b = sc.nextInt();

                char tmp = ss[a-1];
                ss[a-1] = ss[b-1];
                ss[b-1] = tmp;

                System.out.println(String.valueOf(ss));
            }
            else{
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                for (int j = 0; j<ss.length; j++)
                    if (ss[j] == a)
                        ss[j] = b;
                
                System.out.println(String.valueOf(ss));
            }
        }
    }
}