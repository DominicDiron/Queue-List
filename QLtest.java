class QList
{
	class node
	{
		int data;
		node next;
	
		public node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	private node front = null;
	private node rear = null;
	
	public boolean isEmpty()
	{
		return (front==null);
	}
	
	public void enQueue(int data)
	{
		node newNode = new node(data);
		
		if(isEmpty())
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			rear.next = newNode;
			rear = newNode;
		}
		
		System.out.println("enQueued : "+data);
	}
	
	public void deQueue()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("deQueued : "+front.data);
			front = front.next;
		}
	}
	
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("peek : "+front.data);
		}
	}
	
	public void display()
	{
		node current = front;
		
		while(current != null)
		{
			System.out.print(current.data+",");
			current = current.next;
		}
		System.out.println();
	}
}

public class QLtest
{
	public static void main(String args[])
	{
		QList QL = new QList();
		QL.display();
		QL.deQueue();
		QL.enQueue(1);
		QL.enQueue(2);
		QL.enQueue(3);
		QL.enQueue(4);
		QL.enQueue(5);
		QL.enQueue(6);
		
		QL.display();
		
		QL.deQueue();
		QL.deQueue();
		
		QL.display();
		
		
	}
}