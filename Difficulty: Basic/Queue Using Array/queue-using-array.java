class MyQueue {

    int front, rear;
    int arr[] = new int[100005];

    MyQueue() {
        front = 0;
        rear = -1;
    }

    // Function to push an element x in a queue.
    void push(int x) {
        // Your code here
        rear++;
        arr[rear]=x;
        
    }

    // Function to pop an element from queue and return that element.
    int pop() {
        if(front>rear){
            return -1;
        }
        return arr[front++];
        // Your code here
    }
}