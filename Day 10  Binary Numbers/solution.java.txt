import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        consecOfOnes(n);
    }
    
    public static void consecOfOnes(int n){
        int consec=0,currconsec=0,rem;
        while(n>0){
            rem =n %2 ;
            n =n/2 ;
            if(rem==1){
                currconsec++;
                if(currconsec > consec){
                    consec = currconsec;
                }
            }else{
                    currconsec=0;
                }
        }
            System.out.println(consec);    
    }
    
}
