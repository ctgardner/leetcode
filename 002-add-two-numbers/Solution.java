/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode head = null;
      ListNode tail = null;
      
      int carry = 0;
      while(l1 != null || l2 != null) {
          int nextDigit = carry;
          
          if(l1 != null) {
              nextDigit += l1.val;
              l1 = l1.next;
          }
          
          if(l2 != null) {
              nextDigit += l2.val;
              l2 = l2.next;
          }
          
          carry = nextDigit / 10;
          nextDigit %= 10;
          
          ListNode node = new ListNode(nextDigit);
          if(head == null) {
              head = node;
              tail = head;
          }
          else {
              tail.next = node;
              tail = tail.next;
          }
      }
      
      if(carry > 0) {
          tail.next = new ListNode(carry);
          tail = tail.next;
      }
      
      return head;
  }
}
