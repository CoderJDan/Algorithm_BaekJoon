import java.io.BufferedReader;
import java.io.IOException;

public class Baek_11720 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int data = Integer.parseInt(br.readLine());

        char[] arr = br.readLine().toCharArray();

        int sum = 0;
        for(int i=0; i<data; i++) {
            sum = sum + Integer.parseInt(String.valueOf(arr[i]));
        }
        System.out.println(sum);
    }
}
