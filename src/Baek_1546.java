import java.io.*;

public class Baek_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] data = br.readLine().split(" ");

        int sum = 0;
        int max = 0;

        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(data[i]) > max) max = Integer.parseInt(data[i]);
            sum = sum + Integer.parseInt(data[i]);
        }

        System.out.println(sum*100.0/max/N);
    }
}
