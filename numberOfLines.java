import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*We are to write the letters of a given string S, from left to right into lines. 
Each line has maximum width 100 units, and if writing a letter would cause the width of the line
 to exceed 100 units, it is written on the next line. We are given an array widths, an array 
 where widths[0] is the width of 'a', widths[1] is the width of 'b', ..., and widths[25] is the width of 'z'.

Now answer two questions: how many lines have at least one character from S, and 
what is the width used by the last such line? Return your answer as an integer list of length 2.*/

public class numberOfLines {

        public static int[] numberOfLines(int[] widths, String S) {
        int[] res = {0,0};
        if ( S == null || S.length() == 0){
            return res;
        }
        int last_line = 0;
        int lines = 1;
        //int wordslength = 0;
        for ( char c: S.toCharArray()){
            //int wordslength = 0 ; 
            int wordslength = widths [c - 'a'];
            if ( last_line+ wordslength  > 100 ) { lines++ ; last_line = wordslength;}
            else { last_line += wordslength;}
        }
        res [ 0]  = lines;
        res [ 1]  = last_line; 
        return res; 
    }

    public static void main(String[] args) throws IOException {
        int[] width = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        int [] a= numberOfLines (width,"abcdefghijklmnopqrstuvwxyz");
        System.out.println("OLogic: " + a[0] + " " +a[1] ); 
    }
}
