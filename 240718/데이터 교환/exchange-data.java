public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int c=7;
        int ta=a;
        int tb=b;
        int tc=c;
        b = ta;
        c =tb;
        a=tc;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}