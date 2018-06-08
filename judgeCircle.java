/* Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, 
which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character.
 The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class judgeCircle {

    public static boolean judgeCircle(String moves) {
        int U = 0; int D= 0 ; int R = 0 ;int L =0 ; 
        for ( char each:moves.toCharArray()){
            if (each == 'U'){ U++ ;}
            else if ( each == 'D') { D++;}
            else if ( each == 'R') { R++ ;}
            else if (each == 'L') {L++ ;}
        }
        
        return U==D && R==L;
    }

    public static void main(String[] args) throws IOException {
        boolean a= judgeCircle ( "UDUD");
        System.out.println("OLogic: " + a ); 
    }
}