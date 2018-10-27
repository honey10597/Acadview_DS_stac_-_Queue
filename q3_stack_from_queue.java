import java.util.*;
public class q3_stack_from_queue{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
        int size=sc.nextInt();
        Stack s=new Stack(size);
        for(int i=1;i<size;i++)
        {
            s.push(i*10);
        }
        System.out.println("Pop : Removed "+s.pop()+" from stack");
        System.out.print("\nDisplay after pop : ");
        s.display();
    }
}
class Queue
{
    int size;
    int ar[];
   private int front,rear;
    Queue(int size)
    {
        this.size=size;
        ar=new int[size];
        front=rear=0;
    }
    public void enqueue(int d)
    {
         if(rear==size-1)
        {
            System.out.println("underflow");
        }
        else
        {
            ar[rear]=d;
            rear+=1;
        }
    }
    public int dequeue()
    {
     
        if(rear==front)
        {
            return -1;
        }
        else
        return ar[--rear];
    }
    public boolean isEmpty()
    {
        if(front==0)
        {
            return true;
        }
        else
        return false;
    }
    public void display()
    {
        for(int i=front;i<rear;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.print("\nReverse display : ");
        for(int j=rear-1;j>=front;j--)
        {
            System.out.print(ar[j]+" ");
        }
    }
    
}
class Stack
{
    int size;
    Queue q1;
    Queue q2;
    Stack(int size)
    {
        this.size=size;
        q1=new Queue(size);
        q2=new Queue(size);
    }
    public void push(int d)
    {
        q1.enqueue(d);
    }
    public int pop()
    {
      while(!q1.isEmpty())
         q2.enqueue(q1.dequeue());
      int data=q1.dequeue();
        return data;
    }
    public void display()
    {
        q1.display();
    }
}
