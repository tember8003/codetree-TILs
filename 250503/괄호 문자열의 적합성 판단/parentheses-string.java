import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        // Please write your code here.
        Stack<Character> stack = new Stack<>();
        boolean check = true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='('){
                stack.push('(');
            }
            else{
                if(stack.isEmpty()){
                    check = false;
                    break;
                }
                stack.pop();
            }
        }
        if(check && stack.size()==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}