import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int num=sc.nextInt();
        sc.nextLine();
        for( int j=0; j<num ; j++){
        char[] input=(sc.nextLine()).toCharArray(); // convert string into char array
        
        String first="";
        String last="";
        
        for(int i=0; i<input.length ; i++ ){
            if(i%2==0){        
                first += input[i] ;
            }else{
                last += input[i];
            }
        }
        
        System.out.println( first + " " + last );
        
        }
    }
}
