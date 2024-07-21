import java.util.*;
import java.io.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"-");
        String one = st.nextToken();
        String num1 = st.nextToken();
        String num2 = st.nextToken();

        String change = one + "-" + num2 + "-" +num1;
        System.out.println(change);
    }
}