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
        //Collections.sort(ar, new Sortbyname());
         
         ArrayList < Student> temp = new ArrayList<Student>();
        for ( int i =0 ; i< ar.size()-1 ; i++){
            for ( int j = 0 ; j< ar.size()-i-1 ; j++) {
                if (ar.get(j).name.compareTo(ar.get(j+1).name)  >= 0) 
                {   temp.add(ar.get(j));
                    ar.set(j , ar.get(j+1) );
                    ar.set ((j+1) , temp.get(0));
                    temp.remove(0);
                }
            }
        }
}
 }
 
 /* for ( int i =0 ; i< ar.size()-1 ; i++){
            for ( int j = 0 ; j< ar.size()-i-1 ; j++) {
                if (ar.get(j).ID > ar.get(j+1).ID) 
                {   temp.add(ar.get(j));
                    ar.set(j , ar.get(j+1) );
                    ar.set ((j+1) , temp.get(0));
                    temp.remove(0);
                    //System.out.println(ar.get(i)); 
                }
            }
        } */