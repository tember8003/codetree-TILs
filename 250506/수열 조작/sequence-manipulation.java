import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i=1; i<=n; i++){
            deque.addLast(i);
        }

        while(deque.size()!=1){
            deque.pollFirst();
            deque.addLast(deque.peek());
            deque.pollFirst();
        }

        System.out.println(deque.peek());
    }
}