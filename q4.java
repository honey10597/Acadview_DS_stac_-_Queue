class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}

class Stack{
	int top;
	int[] arr;
	Node head;
	Stack(){
		top=-1;
 	}
	void push(int data){				//==========push = insert beginning
			Node temp=new Node(data);
			temp.next=head;
			head=temp;
			top++;
		
	}
	Node pop(){
		
		if(top == -1){
			System.out.println("Under flow ");
			return null;
		}
		else{
			Node a=head;
			head=head.next;
			top--;
			return a;
		}
		
	}

	void pushInSecondStack(){
		Node temp=head;
		Stack ob=new Stack();
		while(temp!=null){
			temp=temp.next;
			ob.push(pop().data);
		}
	head = ob.head;
	top = ob.top;
	}

	void display(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"	");
			temp=temp.next;
		}
		System.out.println();
	}
}

public class q4 {
	
	public static void main(String[] args){
		Stack obj=new Stack();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.pushInSecondStack();
		obj.display();
		Node n=obj.pop();
		System.out.println("=============");
		System.out.println("pop -> "+n.data);
		System.out.println("=============");
		obj.display();
	}
}