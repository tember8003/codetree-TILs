import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 변수 선언 및 입력
        int n = sc.nextInt();

        // 덱 선언
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < n; i++) {
            String command = sc.next();

            if(command.equals("push_front")) {
                int x = sc.nextInt();
                dq.addFirst(x);
            }
            else if(command.equals("push_back")) {
                int x = sc.nextInt();
                dq.addLast(x);
            } 
            else if(command.equals("pop_front")) {
                System.out.println(dq.pollFirst());
            }
            else if(command.equals("pop_back")) {
                System.out.println(dq.pollLast());
            }
            else if(command.equals("size")) {
                System.out.println(dq.size());
            }
            else if(command.equals("empty")) {
                if(dq.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(command.equals("front")) {
                System.out.println(dq.peekFirst());
            }
            else {
                System.out.println(dq.peekLast());
            }
        }
    }
}
