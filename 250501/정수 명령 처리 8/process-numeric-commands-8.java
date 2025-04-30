import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> l = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            // Please write your code here.
            if(command.equals("push_front")) {
                int x = sc.nextInt();
                l.addFirst(x);
            }
            else if(command.equals("push_back")) {
                int x = sc.nextInt();
                l.addLast(x);
            } 
            else if(command.equals("pop_front")) {
                System.out.println(l.pollFirst());
            }
            else if(command.equals("pop_back")) {
                System.out.println(l.pollLast());
            }
            else if(command.equals("size")) {
                System.out.println(l.size());
            }
            else if(command.equals("empty")) {
                if(l.isEmpty())
                    System.out.println(1);
                else
                    System.out.println(0);
            }
            else if(command.equals("front")) {
                System.out.println(l.peekFirst());
            }
            else {
                System.out.println(l.peekLast());
            }
        }
    }
}