/*Given a string S and a character C, return an array of integers representing the shortest distance from the character C in the string.



Input: S = "lovejeepcode", C = 'e'
Output: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]  */

class shortestToChar {
    public int[] shortestToChar(String S, char C) {
        int length = S.length();
        int position = -length;
        int[] position_list = new int[length];
        for ( int i=0 ; i < length; i++){
            if( S.charAt(i) == C ){
                position = i; 
			}
            position_list[i] = i- position  ;  
        }
        
        for ( int i=length-1 ;  i >= 0; i--){
            if( S.charAt(i) == C) {
                position = i;
			}
            position_list[i] = Math.min ( position_list[i], Math.abs( position - i));
                
        }
        
        return position_list;
    }
}