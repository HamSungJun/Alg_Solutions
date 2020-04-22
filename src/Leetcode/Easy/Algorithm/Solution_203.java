package Leetcode.Easy.Algorithm;

class Solution_203 {
    public ListNode removeElements(ListNode head, int val) {

        if (head == null) return null;
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;
        while (head != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
                continue;
            }
            curr = curr.next;
        }

        curr = head;
        return curr;

    }
}
