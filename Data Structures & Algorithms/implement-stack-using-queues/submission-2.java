class MyStack { //most efficients solution
    private Queue<Integer> queue; // lifo

    public MyStack() {
        this.queue = new LinkedList();
    }

    public void push(int x) { // puts to the front of queue. optimized
        queue.offer(x);
        for (int i = 0; i < this.queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return this.queue.peek();
    }

    public boolean empty() {
        return this.queue.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();

    Throws exception	Returns special value
Insert	add(e)	        offer(e)
Remove	remove()	    poll()
Examine	element()	    peek()
 */