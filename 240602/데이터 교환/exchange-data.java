public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c = 7;
        int tmp1 = a;
        int tmp2 = b;
        a = c;
        b = tmp1;
        c = tmp2;
        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}