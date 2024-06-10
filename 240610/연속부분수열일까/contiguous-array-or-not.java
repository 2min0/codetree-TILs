import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int[] arrA = new int[n1];
        int[] arrB = new int[n2];

        for (int i = 0; i<n1; i++)
            arrA[i] = sc.nextInt();
        for (int i = 0; i<n2; i++)
            arrB[i] = sc.nextInt();

        boolean success = true;

        for (int i = 0; i<=n1-n2; i++){
            success = true;
            for (int j = 0; j<n2; j++){
                if (arrA[i+j] != arrB[j]){
                    success = false;
                    break;
                }
            }
            if (success == true) break;
        }

        if (success == true) System.out.print("Yes");
        else System.out.print("No");
    }
}