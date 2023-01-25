package com.bridgelabs.linkedlist;

public class Linked_List<T> 
{
	class Node{
		T data;
		Node next;
		
		Node(T data)
		{
			this.data=data;
			this.next=null;
		}
	}
	Node head=null;
	
	public void addNode(T data)
	{
		Node newNode=new Node(data);
		if(head==null)
		{
			head=newNode;
		}else
		{
			newNode.next=head;
			head=newNode;
		}
	}
	
	public void print()
	{
		Node curr_node=head;
		while(curr_node!=null)
		{
			System.out.print(curr_node.data+"-->");
			curr_node=curr_node.next;
		}
		System.out.println("null");
		
	}

	public static void main(String[] args) 
	{
		Linked_List linkedlist=new Linked_List();
		linkedlist.addNode(70);
		linkedlist.addNode(30);
		linkedlist.addNode(56);
		linkedlist.print();
	}

}
