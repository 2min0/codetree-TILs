import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] arr = new char[]{'L', 'E', 'B', 'R', 'O', 'S'};

        char n = sc.next().charAt(0);
        boolean find = false;

        for (int i = 0; i<6; i++){
            if (n == arr[i]){
                System.out.print(i);
                find = true;
                break;
            }
        }

        if (find == false)
            System.out.print("None");
    }
}