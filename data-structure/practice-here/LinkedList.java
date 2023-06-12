public class LinkedList
{
	Node head;

	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.next = null;

		if ( head==null)
		{
			head=node;
			System.out.println(head);
		}
		else
		{
			Node n = head;
			System.out.println(n);
			System.out.println(n.next);
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = node;
		}
	}
	public void show()
	{
		Node node = head;
		System.out.println("carefult aa");
		System.out.println(node);
		while(node.next!=null)
		{
			System.out.println(node.data);
			node=node.next;
			System.out.println("next");
			System.out.println(node);
		}
		System.out.println(node.data);
	}
}

