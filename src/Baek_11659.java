import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] data = br.readLine().split(" ");
        int num1 = Integer.parseInt(data[0]);
        int num2 = Integer.parseInt(data[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[num1];
        int[] arr2 = new int[num1+1];
        for(int i = 0; i<num1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        arr2[0] = 0;
        for(int i=1; i<=num1; i++) {
            arr2[i] = arr2[i-1] + arr[i-1];
        }

        for(int i=0; i<num2; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(arr2[b]-arr2[a-1]);
        }
    }
}
