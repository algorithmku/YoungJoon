import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] sArr = s.toCharArray();
        long repeat = n / sArr.length;  // 반복수
        long rest = n % sArr.length;    // 나머지
        long aCount = 0;
        long rCount = 0;
       
        if(n >= 0 && n <= Math.pow(10, 12) && s.length() <= 100) {
            //입력값 s의 'a'글자 총개수 구하기.
            for(int i = 0; i < sArr.length; i++) {
                if(sArr[i] == 'a')
                    aCount++;      
            }

            //반복하고 나머지에 대해 'a'글자 총개수 구하기.
            for(int j = 0; j < rest; j++) {
                if(sArr[j] == 'a')
                    rCount++;
            }

        }
       return (aCount * repeat) + rCount;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
