package Leetcode.Easy.Algorithm;

import java.util.LinkedList;
import java.util.List;

public class MyStack {

    /**
     * Initialize your data structure here.
     */
    private List<Integer> myQueue;
    private int top = -1;

    public MyStack() {
        myQueue = new LinkedList<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        myQueue.add(x);
        top += 1;
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return myQueue.remove(top--);
    }

    /**
     * Get the top element.
     */
    public int top() {
        if (myQueue.isEmpty())
            return -1;
        return myQueue.get(top);
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        if (myQueue.size() == 0)
            return true;
        return false;
    }
}
