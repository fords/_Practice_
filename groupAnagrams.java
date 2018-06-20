/*Given an array of strings, group anagrams together.

Example:

Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]  */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> myList = new ArrayList<List<String>>();
        HashMap<String, Integer> map = new HashMap<>();
        int i = 0;
        for (String each: strs){
            char[] word = each.toCharArray();
            Arrays.sort(word); 
           // System.out.println(word);
            if ( map.containsKey(String.valueOf(word))){
                //mylist add char  at index map.get(char);
                myList.get( map.get(String.valueOf(word)) ).add(each);
            }
            else{
                map.put(String.valueOf(word),i );
                //if new string,  add char at i and increment i 
                List<String> newlist = new ArrayList<String>();
                newlist.add(each);
                myList.add(newlist); 
                i++;
            } 
          
        }
        return myList;
        
    }
}