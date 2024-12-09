import java.io.*;

public class Baek_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] data = br.readLine().split(" ");

        int n = Integer.parseInt(data[0]);
        int m = Integer.parseInt(data[1]);

        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] data2 = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(data2[j]);
            }
        }

        int[][] sum = new int[n+1][n+1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+arr[i-1][j-1];
            }
        }

        for(int i=0; i<m; i++) {
            String data2 = br.readLine();
            int a = Integer.parseInt(data2.split(" ")[0]);
            int b = Integer.parseInt(data2.split(" ")[1]);
            int c = Integer.parseInt(data2.split(" ")[2]);
            int d = Integer.parseInt(data2.split(" ")[3]);

            int result = sum[c][d]-sum[a-1][d]-sum[c][b-1]+sum[a-1][b-1];
            bw.write(result+"\n");
        }
        bw.flush();
        bw.close();

    }
}
