/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
      ListNode root = new ListNode(-1);
      ListNode ptr = root;
      
      while(l1 != null && l2 != null) {
          int val;
          if(l1.val < l2.val) {
              val = l1.val;
              l1 = l1.next;
          }
          else {
              val = l2.val;
              l2 = l2.next;
          }
          
          ptr.next = new ListNode(val);
          ptr = ptr.next;
      }
      
      addAll(ptr, l1);
      addAll(ptr, l2);
      
      return root.next;
  }
  
  private void addAll(ListNode dest, ListNode src) {
      while(src != null) {
          dest.next = new ListNode(src.val);
          dest = dest.next;
          src = src.next;
      }
  }
}
