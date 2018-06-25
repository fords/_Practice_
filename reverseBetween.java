/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        int position = 1;
        ListNode node = head;
        ListNode previous = null;
        while (node != null && node.next != null)
        {
            position++;

            if (position > n)
            {
                return head;
            }

            if (position > m)
            {
                ListNode temp = node.next;

                node.next = node.next.next;

                if (previous != null)
                {
                    temp.next = previous.next;
                    previous.next = temp;
                }
                else
                {
                    temp.next = head;
                    head = temp;
                }
                
            }
            else
            {
                // next node
                previous = node;
                node = node.next;
            }

        }

        return head;
    }
}

public class MainClass {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        int[] nodeValues = stringToIntegerArray(input);
    
        // Now convert that list into linked list
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
    
    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
    
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val) + ", ";
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            ListNode head = stringToListNode(line);
            line = in.readLine();
            int m = Integer.parseInt(line);
            line = in.readLine();
            int n = Integer.parseInt(line);
            
            ListNode ret = new Solution().reverseBetween(head, m, n);
            
            String out = listNodeToString(ret);
            
            System.out.print(out);
        }
    }
}