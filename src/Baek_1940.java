import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class Baek_1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");

        int[] arr = new int[num1];
        for(int i=0; i<num1; i++) {
            arr[i] = Integer.parseInt(data[i]);
        }

        Arrays.sort(arr);

        int startIndex = 0;
        int endIndex = num1-1;

        int count = 0;

        while(startIndex < endIndex) {
            int sum = arr[startIndex]+arr[endIndex];
            if(sum < num2) {
                startIndex++;
            } else if(sum > num2) {
                endIndex--;
            } else {
                count++;
                startIndex++;
                endIndex--;
            }
        }
        System.out.println(count);
    }
}
