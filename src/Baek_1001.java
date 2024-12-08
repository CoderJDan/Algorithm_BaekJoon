import java.io.*;

public class Baek_1001 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        int result = Integer.parseInt(num[0]) - Integer.parseInt(num[1]);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }
}
