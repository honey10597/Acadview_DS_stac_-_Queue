import java.util.*;
public class q2_queue_from_stack
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter size");
        int size=sc.nextInt();
        
        Queue q=new Queue(size);
        for(int i=1;i<size;i++)
        {
            q.enqueue(i);
        }
        System.out.println("dequeue : remove "+q.dequeue()+" from queue");
         System.out.print("\nDisplay : ");
        q.display();
        
    }
}
class Stack
{
    int top=-1;
    int ar[];
    int size;
    Stack(int size)
    {
        this.size=size;
        ar=new int[size];
    }
    public void push(int d)
    {
        if(top==size-1)
          System.out.println("overflow");
          else
        ar[++top]=d;
    }
    public int pop()
    {
        if(top==-1)
        {
            return -1;
        }
        else
         return ar[top--];
    }
    public int peek()
    {
        if(top==-1)
          return -1;
        else
          return ar[top];   
    }
    public boolean isEmpty()
    {
        if(top==-1)
        return true;
        else 
          return false;
    }
    public void display()
    {
        for(int i=0;i<=top;i++)
        {
            System.out.print(ar[i]+" ");
        }
        System.out.print("\nReverse display: ");
        for(int j=top;j>=0;j--)
        {
            System.out.print(ar[j]+" ");
        }
        
    }
}
class Queue
{
   
    int front,rear;
    int size;
    Stack s1;
    Stack s2;
    Queue(int size)
    {
        this.size=size;
        s1=new Stack(size);
        s2=new Stack(size);
    }
    public void enqueue(int d)
    {
        s1.push(d);
    }
    public int dequeue()
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        int data=s2.pop();
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
        return data;
    }
    public void display()
    {
        if(s1.isEmpty())
        {
            while(!s2.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.display();
        }
        else
        s1.display();
    }
    
}