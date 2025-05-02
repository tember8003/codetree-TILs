import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        // Please write your code here.
        int p =1;
        for(int pos = 0; pos < 6; pos++){
            ArrayList<Integer>[] newArr = new ArrayList[10];
            for(int i=0; i<10; i++){
                newArr[i] = new ArrayList<>();
            }

            for(int i=0; i<n; i++){
                int digit = (arr[i]/p)%10;
                newArr[digit].add(arr[i]);
            }

            int index = 0;
            for(int i=0; i<10; i++){
                for(int j=0; j<newArr[i].size(); j++){
                    arr[index++] = newArr[i].get(j);
                }
            }

            p*=10;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}