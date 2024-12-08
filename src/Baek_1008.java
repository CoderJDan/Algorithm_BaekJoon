
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

// float 은 4byte, 소숫점 8 자리까지 표현
// double 은 8byte, 소숫점 16 자리까지 표현
// BigDecimal 은 Java 에서 숫자를 정밀하게 표현할 수 있는 객체
// 16 자리 이상의 소숫점을 다룬다면 필수적으로 사용해야 함
// BigDecimal 의 유일한 단점은 느린 속도와 기본 타입보다 조금 불편한 사용법
// 더하기, 빼기, 곱하기, 나누기
// .add , .subtract, .multiply, .divide

public class Baek_1008 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        BigDecimal num1 = new BigDecimal((sc.nextInt()));
        BigDecimal num2 = new BigDecimal((sc.nextInt()));

        System.out.println(num1.divide(num2, MathContext.DECIMAL128));

    }
}

/*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] num = br.readLine().split(" ");

        double result = Double.parseDouble(num[0]) / Double.parseDouble(num[1]);

        bw.write(result + "\n");
        bw.flush();
        bw.close();
    }*/