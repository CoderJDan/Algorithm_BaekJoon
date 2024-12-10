/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baek_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");

        int sum = 0;
        int max = 0;
        float avg = 0;

        for(int i=0; i<N; i++) {
            if(Integer.parseInt(data[i])>Integer.parseInt(data[i+1])) {
                sum = sum + Integer.parseInt(data[i]);
                max = Integer.parseInt(data[i]);
            }
            else {
                sum = sum + Integer.parseInt(data[i]);
            }
        }
        avg = (float) sum /max*100;
    }
}
*/
