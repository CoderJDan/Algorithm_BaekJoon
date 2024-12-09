import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Back_1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] data = br.readLine().split(" ");

        int num1 = Integer.parseInt(data[0]);
        int num2 = Integer.parseInt(data[1]);

        if(num1 > num2)
            System.out.println(">");
        else if(num1 < num2)
            System.out.println("<");
        else {
            System.out.println("==");
        }

        br.close();
    }
}
