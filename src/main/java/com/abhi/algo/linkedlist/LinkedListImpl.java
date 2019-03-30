package com.abhi.algo.linkedlist;

public class LinkedListImpl {

	public static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
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
	}

}
