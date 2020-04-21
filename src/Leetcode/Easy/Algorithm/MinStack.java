package Leetcode.Easy.Algorithm;

import java.util.Stack;

public class MinStack {

    /** initialize your data structure here. */
    private Stack<Node> myStack;

    public MinStack() {

        this.myStack = new Stack<>();

    }

    public void push(int x) {

        if(this.myStack.isEmpty()){
            this.myStack.push(new Node(x, x));
        } else {
            int recentMin = this.myStack.peek().min;
            this.myStack.push(new Node(x, (Math.min(recentMin, x))));
        }

    }

    public void pop() {

        myStack.pop();

    }

    public int top() {

        if(myStack.isEmpty())
            return -1;
        return myStack.peek().val;

    }

    public int getMin() {

        if(myStack.isEmpty())
            return -1;
        return myStack.peek().min;

    }

}
