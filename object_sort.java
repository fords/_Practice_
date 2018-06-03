import java.util.*;
import java.lang.*;
import java.io.*;
class student {
    
    int ID;
    String studentname; 
    public student( int ID, String studentname) {
        this.ID = ID;
        this.studentname  = studentname; 
    }
}
class sortby implements Comparator<student> {
    public int compare( student a, student b){
        return a.studentname.compareTo(b.studentname); 
    }
       
}


public class Main {
    public static void main(String[] args) {
        List <student> object = new ArrayList< student > ();
        
        object.add(new student (1, "Kat"));
        object.add(new student (2, "Zac"));
        object.add(new student (3, "Lopez")); 
        Collections.sort(object, new sortby());
        for ( student each:object){
            System.out.println( each.studentname);
        }
    }
}