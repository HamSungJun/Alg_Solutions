package Leetcode.Easy.Algorithm;

class Solution_206 {
    public ListNode reverseList(ListNode head) {

        return reverseList(head, null);

    }

    public ListNode reverseList(ListNode curr, ListNode prev) {
        if (curr == null) return prev;
        ListNode next = curr.next;
        curr.next = prev;
        return reverseList(next, curr);
    }

//    public ListNode reverseList(ListNode head){
//        ListNode res = null;
//        ListNode curr = head;
//        while(curr != null){
//            ListNode newNode = new ListNode(curr.val);
//            newNode.next = res;
//            res = newNode;
//            curr = curr.next;
//        }
//
//        return res;
//
//    }

    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + (curr.next != null ? "->" : ""));
            curr = curr.next;
        }
    }
}
