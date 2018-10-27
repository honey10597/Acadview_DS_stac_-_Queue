import java.util.*;
public class q1_stack&queue {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\nStack : \n\n");
        Stack s=new Stack();
        System.out.println("enter size of stack");
        int size=sc.nextInt();
        int i=0;
        node head;
        for(i=0;i<size;i++)
        {
            s.push(i);
        }
        System.out.println(s.pop());
        System.out.println("stack isEmpty : "+s.isEmpty());
        System.out.println("stack peek : "+s.peek());
        System.out.print("Stack : ");
        s.dis();
        
        System.out.println("\n\nQueue : \n\n");
        Queue q=new Queue();
        System.out.println("\nenter the size of queue");
        int sizeq=sc.nextInt();
        for(i=0;i<sizeq;i++)
        {
            q.enqueue(i);
        }
        System.out.println(q.dequeue());
        System.out.println("Queue peek "+q.qpeek());
        System.out.println("Queue iEmpty : "+q.isEmptyq());
        System.out.print("Queue : ");
        q.display();
        
        
    }
}
class node
{
    int data;
    node next;
    node(int data)
    {
        this.data=data;
    }
}
class Stack
{
    node top;
    public void push(int d) // insertion in beagning 
    {
        node temp=new node(d);
        if(top==null)
        {
            top=temp;
        }
        else
        {
            node temp1=temp;
            temp1.next=top;
            top=temp1;
        }
    }
    public int pop() // pop the first element
    {
        if(top==null)
        {
			System.out.println("empty");
			return -1;
		}
        else
        {
            System.out.println(" pop the element");
            top=top.next;
			return top;
        }
    }
    public boolean isEmpty()
    {
        if(top==null)
          return true;
        else
          return false;
    }
    public int peek()
    {
        if(top==null)
        return -1;
        else
        return top.data;
    }
    public void dis()
    {
        node head=top;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}


class Queue
{
    node front,rear;
    public void enqueue(int d)
    {
        node temp=new node(d);
        if(front==null)
        {
            front=rear=temp;
        }
        else
        {
            node temp1=front;
            while(temp1.next!=null)
            {
                temp1=temp1.next;
            }
            temp1.next=temp;
            rear=temp;
        }
    }
    public int  qpeek()
    {
        if(front==null)
        {
            System.out.println("Queue is Empty");
            return -1;
        }
        else
        return front.data;
    }
    public boolean isEmptyq()
    {
        if(front==null)
        return true;
        else
        return false;
    }
    public void dequeue()
    {
        if(front==null)
        System.out.println("queue is empty");
        else
        {
            System.out.println(" Dequeue the element");
            front=front.next;
        }
    }
    public void display()
    {
        node head=front;
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}

