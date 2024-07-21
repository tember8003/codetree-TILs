import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(lcm(n,m));
    }
    public static int gcd(int a,int b){
        int r=0;
        while(b!=0){
            r = a%b;
            a=b;
            b=r;
        }
        return a;
    }
    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }
}