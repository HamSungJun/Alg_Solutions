package Leetcode.Easy.Algorithm;

public class Solution_160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode currA = headA;
        ListNode currB = headB;

        int lenA = 0;
        int lenB = 0;

        while(currA != null){
            lenA += 1;
            currA = currA.next;
        }

        while(currB != null){
            lenB += 1;
            currB = currB.next;
        }

        if(currA != currB) return null;

        currB = headB;
        currA = headA;

        if(lenB > lenA){

            int cntB = lenB - lenA;
            while(cntB-- > 0){
                currB = currB.next;
            }

        } else {

            int cntA = lenA - lenB;
            while(cntA-- > 0){
                currA = currA.next;
            }
        }

        while(currB != currA){
            currB = currB.next;
            currA = currA.next;
        }

        return currA;

    }
}
