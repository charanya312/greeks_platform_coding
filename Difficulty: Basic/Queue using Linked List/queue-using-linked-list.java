/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/

class MyQueue
{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a)
	{
        // Your code here
        if(rear==null || front==null){
            QueueNode q=new QueueNode(a);
            rear=front=q;
        }
        else{
            QueueNode q=new QueueNode(a);
            rear.next=q;
            rear=rear.next;
        }
	}
	
    //Function to pop front element from the queue.
	int pop()
	{
	    if(front==null)return -1;
	    int x=front.data;
	    front=front.next;
	    return x;
        // Your code here
	}
}




