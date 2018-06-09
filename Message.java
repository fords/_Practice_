import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*
 The message class has senderID, recipientID, ID 
 Calculate the rate of sending = # Conversation of sender/ Total # of ID 
*/
class Message{
    int sender;
    int recipient;
    int ID;
    
    public Message( int sender, int recipient, int ID){
        this.sender = sender;
        this.recipient = recipient;
        this.ID = ID;
    }
}


public class calculate {

     public static void calculate(int ID, ArrayList<Message> message_list) {
        System.out.println("HE"); 
         ArrayList <Message> arr = new ArrayList <Message> ();
        ArrayList <Message> arr2 = new ArrayList <Message> ();
         for (Message each:message_list){
             if ( each.sender == ID ) {
                    arr.add(each);
             }
         }
         for ( Message each:message_list){
             if ( each.recipient == ID)// && !(arr.contains(each)) && !(arr2.contains(each))){
             {   arr2.add(each);
             }
         }
         for (int i = 0 ; i < arr.size()-1; i++ ){
             if (arr.get(i).ID == arr.get(i+1).ID ){
                 arr.remove(i+1);
             }
         }
         for ( int i = 0 ; i < arr2.size()-1 ; i++){
             if (arr2.get(i).ID == arr2.get(i+1).ID ){
                 arr2.remove(i+1);
             }
         }   
         //System.out.println(arr.size());
        // System.out.println(arr2.size());
         int result = arr.size()*100/arr2.size();
         System.out.println(result);
     }

     public static void main(String[] args) 
    {       ArrayList <Message> arr = new ArrayList <Message> ();
            arr.add(new Message(81,842,81) );
            arr.add(new Message(842,81,81));
            arr.add(new Message(81,842,81));
            arr.add(new Message(842,81,81) );
            arr.add(new Message(82,842,82));
            arr.add(new Message(82,842,82));
            arr.add(new Message(82,842,83) );
            arr.add(new Message(842,83,83));
            arr.add(new Message(83,888,84));
            arr.add(new Message(83,899,95) );
            arr.add(new Message(84,842,86));
            arr.add(new Message(842,84,86));
            int ID= 842;
            calculate(ID, arr);
            //print(arr);
    }
}
