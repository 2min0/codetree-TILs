import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[10];

        for (int i = 0; i<10; i++)
            arr[i] = sc.next();
        
        char target = sc.next().charAt(0);
        boolean exist = false;

        for (int i = 0; i<10; i++){
            if (arr[i].charAt(arr[i].length()-1) == target){
                System.out.println(arr[i]);
                exist = true;
            }
        }

        if (exist == false)
            System.out.print("None");
    }
}