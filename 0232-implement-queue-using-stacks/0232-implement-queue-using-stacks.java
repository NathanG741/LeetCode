class MyQueue {

Stack<Integer> input;
Stack<Integer> output;
    
    public MyQueue() {
        
        input = new Stack<>();
        output = new Stack<>();
    }
    
    public void push(int x) {
        input.push(x);
    }
    
    public int pop() {
        int val=peek();
        output.pop();
        return val;
    }
    
    public int peek() {
        if(output.isEmpty()){
            while(input.isEmpty()==false)
            output.push(input.pop());
        }
        return output.peek();
    }
    
    public boolean empty() {
        
        return input.isEmpty() && output.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */