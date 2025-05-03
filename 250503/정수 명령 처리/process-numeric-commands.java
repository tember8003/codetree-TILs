import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            String command = sc.next();
            if(command.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            }
            else if(command.equals("pop")){
                System.out.println(stack.pop());
            }
            else if(command.equals("size")){
                System.out.println(stack.size());
            }
            else if(command.equals("empty")){
                if(stack.isEmpty()){
                    System.out.println(1);
                }
                else{
                    System.out.println(0);
                }
            }
            else{
                System.out.println(stack.peek());
            }
        }
    }
}