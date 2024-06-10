import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        int[] nArr = new int[n];

        for (int i = 0; i<n; i++){
            nArr[i] = sc.nextInt();
        }

        for (int i = 0; i<q; i++){
            int a = sc.nextInt();
            if (a == 1){
                int b = sc.nextInt();
                System.out.println(nArr[b-1]);
            }
            else if (a == 2){
                int b = sc.nextInt();
                boolean find = false;
                for (int j = 0; j<n; j++){
                    if (nArr[j] == b){
                        System.out.println(j+1);
                        find = true;
                        break;
                    }
                }
                if (find == false)
                    System.out.println(0);
            }
            else{
                int s = sc.nextInt();
                int e = sc.nextInt();
                for (int j = s-1; j<=e-1; j++){
                    System.out.printf("%d ", nArr[j]);
                }
                System.out.println();
            }
        }
    }
}