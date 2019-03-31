package com.abhi.algo.linkedlist;

public class LinkedListImpl {

	public static class Node {
		int data;
		Node next;
		
		public Node() {
			
		}
		public Node(int data) {
			this.data = data;
		}
		
		//TODO implement it
		private static Node insertNode(Node head, int data) {
			Node newNode = new Node(data);
			newNode.next = null;
			return newNode;
		}
		private static Node insertNodeFirst(Node node, int data) {
			Node newNode = new Node(data);
			newNode.next = node;
			return newNode;
		}
		
		private static Node find(Node head, int data) {
			while(head.next!=null && head.data!=data) {
				head = head.next;
			}
			return head;
		}
		
		private static void deleteNode(Node head, int data) {
			Node previous = new Node();
			while(head.next!=null && head.data!=data) {
				System.err.println("before previous: "+previous.data);
				System.err.println("before data: "+head.data);
				previous = head;
				System.err.println("after previous: "+previous.data);
				head = head.next;
				System.err.println("after head: "+head.data);
			}
			previous.next = head.next;
		}
		
		private static void traverseLL(Node head) {
			while(head.next!=null) {
				System.err.println(head.data);
				head = head.next;
			}
			System.err.println(head.data);
		}
	}

	public static void main(String args[]) {
		Node firstNode = new Node(10);
		Node secondNode = new Node(20);
		Node thirdNode = new Node(30);
		firstNode.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = null;
		System.out.println("first Node data :" + firstNode.data);
		System.out.println("second Node data :" + secondNode.data);
		System.out.println("third Node data :" + thirdNode.data);
		System.err.println("1st data :" + firstNode.data + "  next :" + firstNode.next.data);
		System.err.println("2nd data :" + secondNode.data + "  next :" + secondNode.next.data);
		System.err.println("3rd data :" + thirdNode.data + "  next :" + thirdNode.next);

		Node newHead = Node.insertNodeFirst(firstNode, 5);
		System.err.println("After inserting head..............");
		System.out.println("New Head Node data :" + newHead.data);
		System.out.println("first Node data :" + firstNode.data);
		System.out.println("second Node data :" + secondNode.data);
		System.out.println("third Node data :" + thirdNode.data);
		System.err.println("new Head data :" + newHead.data + "  next :" + newHead.next.data);
		System.err.println("1st data :" + firstNode.data + "  next :" + firstNode.next.data);
		System.err.println("2nd data :" + secondNode.data + "  next :" + secondNode.next.data);
		System.err.println("3rd data :" + thirdNode.data + "  next :" + thirdNode.next);
	
		Node findNode = Node.find(newHead, 10);
		System.err.println("The element is: "+findNode.data);
		
		
		Node.deleteNode(newHead, 20);
		System.err.println("After deleting secondNode..............");
		Node.traverseLL(newHead);
	}

}
