import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RemoveSpace {

   

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String s = " Hell o ";
        String[] arr = s.split(" ");
        String res =""; 
        //System.out.println(arr.length); 
        for (String each:arr){
            res += each;
        }
        System.out.println(res); 
    }
}
