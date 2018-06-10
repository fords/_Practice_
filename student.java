import java.util.*;
import java.lang.*;
import java.io.*;
 
class Student {
    int ID;
    String name;
    
    public Student ( int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    
    public String toString(){
        return this.ID+ " " + this.name+ " ";
    }
}
class SortbyID implements Comparator < Student> {
    public int compare(Student a, Student b){
        return a.ID - b.ID;
    }
}
 class Sortbyname implements Comparator <Student> {
    public int compare(Student a, Student b){
        return a.name.compareTo(b.name);
    }
}
 class Main {
   
     public static void main(String[] args) 
    {       
         ArrayList< Student > ar= new ArrayList<Student> ();
         ar.add(new Student(1,"JO"));
         ar.add(new Student(3,"Aacy"));
         ar.add(new Student(2,"za"));
         System.out.println("Unsorted");
         for ( int i = 0 ; i < ar.size(); i++){
            System.out.println(ar.get(i));
        }
        Collections.sort(ar, new Sortbyname());
        for ( int i =0 ; i< ar.size() ; i++){
           
            {System.out.println(ar.get(i)); }
        }
    }
}