import java.io.*;
import java.util.StringTokenizer;

public class Baek_10869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        bw.write(num1 + num2+"\n");
        bw.write(num1 - num2+"\n");
        bw.write(num1 * num2+"\n");
        bw.write(num1 / num2+"\n");
        bw.write(num1 % num2+"\n");

        bw.flush();
        bw.close();

    }
}

        /*System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);*/