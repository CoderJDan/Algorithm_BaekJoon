import java.io.*;

public class Baek_10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String userId = br.readLine();

        bw.write(userId+"??!");
        bw.flush();
        bw.close();
    }
}
