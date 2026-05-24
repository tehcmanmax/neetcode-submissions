class MyStack {
    private Queue<Integer> queue; // fifo

    public MyStack() {
        this.queue = new LinkedList();
    }

    public void push(int x) {
        this.queue.offer(x);
    }

    public int pop() { // gets the front of queue
        for (int i = 0; i < this.queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
        return queue.poll();
    }

    public int top() { // gets the front of queue
        for (int i = 0; i < this.queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
        int res = this.queue.poll();
        this.queue.offer(res); // to restore the order for future pop() operations
        return res;
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
