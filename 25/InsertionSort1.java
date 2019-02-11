import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        for (int i = n - 1; i > 0; i--) {   // 끝에서 부터 정렬하므로 시작은 요솟수 - 1
            int j;
            int tmp = arr[i];   // 정렬 기준
                
            for (j = i; j > 0 && arr[j - 1] > tmp; j--) {   // 기준과 비교
                arr[j] = arr[j - 1];
                for(int h = 0; h < n; h++) {    // 과정 출력
                    System.out.print(arr[h] + " ");
                }                      
                System.out.print("\n");
            }
            arr[j] = tmp;
        }
        for(int i = 0; i < n; i++) {    // 최종 결과 출력
            System.out.print(arr[i] + " ");
        }
       
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
