import java.util.*;  
class uniqueMorseRepresentations {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        HashSet <String> set = new HashSet <String> ();
        for ( String each:words){
            StringBuilder str_val = new StringBuilder();
            for (char c : each.toCharArray()){
                str_val.append( morse[ (c - 'a')]);
                 
            }
            if ( ! set.contains(str_val.toString())) {    
                set.add( str_val.toString());
            }
        }
        return set.size();
    }
}