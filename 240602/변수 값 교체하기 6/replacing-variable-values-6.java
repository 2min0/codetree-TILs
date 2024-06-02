public class Main {
    public static void main(String[] args) {
        int a = 2, b = 5;
        int tmp = a;
        a = b;
        b = tmp;
        System.out.print("%d\n%d", a, b);
    }
}