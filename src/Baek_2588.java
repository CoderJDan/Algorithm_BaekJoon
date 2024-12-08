import java.io.*;

public class Baek_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num1 = Integer.parseInt(br.readLine());
        char[] num2 = br.readLine().toCharArray();
        StringBuilder num3 = new StringBuilder();
        int[] result = new int[num2.length];

        for(int i = 0; i < 3; i++){
            num3.append((num2[i]));
            result[i] = num1*Character.getNumericValue(num2[i]);
        }
        bw.write(result[2]+"\n"+result[1]+"\n"+result[0]+"\n");
        int num4 = num1*Integer.parseInt(num3.toString());

        bw.flush();
        System.out.println(num4);
        bw.close();
    }
}
