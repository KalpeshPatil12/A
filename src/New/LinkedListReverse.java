package New;

import java.util.Scanner;

//public class ReverseNumber {

		
//		public static void reverseNumber(int number) 
//		{
//			if(number < 10)
//			{ 
//				System.out.println(number);
//				return;
//			}
//			else
//			{
//				System.out.println(number % 10);
//				reverseNumber(number/10);
//			}
//		}
//		
//		public static void main(String[]args)
//		{ 
//			System.out.print("Enter the number here");
//			
//			Scanner sc = new Scanner(System.in);
//			
//			int num = sc.nextInt();
//			
//			//System.out.print("Reverse number is");
//			
//			reverseNumber(num);
//			
//		}
public class LinkedListReverse 
{

	class Node
	{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	public Node head = null;
	public Node tail = null;
	
	public void addNode(int data)
	{
		Node newNode = new Node(data);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;
		}
		else
		{
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	public void reverse(Node current)
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		else
		{
			if(current.next==null)
			{
				System.out.println(current.data + "");
				return;
			}
			reverse(current.next);
			System.out.println(current.data + "");
		}
	}
	
	public void display()
	{
		Node current = head;
		if(head ==null)
		{
			System.out.println("List is Empty");
			return;
		}
		
		while(current!= null)
		{
			System.out.println(current.data + "");
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		LinkedListReverse revlist = new LinkedListReverse();
		revlist.addNode(1);
		revlist.addNode(2);
		revlist.addNode(3);
		revlist.addNode(4);
		System.out.println("Original List is:");
		revlist.display();
		
		System.out.println("Reverse List is:");
		revlist.reverse(revlist.head);
	}
	

	}
