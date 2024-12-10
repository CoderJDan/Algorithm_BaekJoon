import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_2018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int data = Integer.parseInt(br.readLine());

        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;
        int count = 1;

        for(int i = 1; i<data; i++) {
            if(sum < data) {
                endIndex++;
                sum = sum + endIndex;
            } else if(sum == data) {
                endIndex++;
                sum = sum + endIndex;
                count++;
                /*
                * sum = sum - startIndex;
                * startIndex++;
                * count++;
                * */
            }
            else {
                sum = sum - startIndex;
                startIndex++;
            }
        }
        System.out.println(count);
    }
}
