package com.techstack.parthshah.javabasics.collections;

import java.util.PriorityQueue;

public class PriorityQueue_Demo {

	public static void main(String[] args) {

		PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
		pqueue.offer(1500);
		pqueue.offer(25);
		pqueue.offer(5);
		pqueue.offer(35);
		pqueue.offer(555);
		
		//store in some random order-5,35,25,1500,555 but when u do poll then it gives in natural sorting order only-5,25,35,555,1500
		System.out.println("Priority queue stores in some random order-5,35,25,1500,555 but when u do poll then it gives in natural sorting order only-5,25,35,555,1500");
		System.out.println("----------------------------------------------------------");
		System.out.println(pqueue);
		System.out.println("----------------------------------------------------------");
		System.out.println(pqueue.peek());//5
		System.out.println(pqueue.peek());//5-gives the top element in queue(highest priority) number from queue
		System.out.println(pqueue.poll());//5
		System.out.println(pqueue.poll());//25
		System.out.println(pqueue.poll());//35
		System.out.println(pqueue.poll());//555
		System.out.println(pqueue.poll());//1500
		System.out.println("If we want to give priority to higher num than create reverse comparator");
		
		System.out.println("Poll when queue is empty-: "+ pqueue.poll());//gives null as queue is empty
//		System.out.println("Remove when queue is empty than it gives below exception-: ");//give exception as queue is empty,so always pefer to use poll rather remove to avoid any exception
//		System.out.println(pqueue.remove());//give exception as queue is empty,so always pefer to use poll rather remove to avoid any exception
		
		PriorityQueue<Integer> pqueueRev = new PriorityQueue<Integer>((p1,p2)-> {return p2-p1; });
		pqueueRev.offer(1500);
		pqueueRev.offer(25);
		pqueueRev.offer(5);
		pqueueRev.offer(35);
		pqueueRev.offer(555);
		System.out.println("=================================================================================");
		System.out.println("-----Priority Queue with priority for highest num -Demo-----------------------------------------------------");
		//store in some random order-5,35,25,1500,555 but when u do poll then it gives in natural sorting order only-5,25,35,555,1500
		System.out.println("Priority queue stores in some random order-5,35,25,1500,555 but when u do poll then it gives priority to highest number only- 1500,555,35,25,5");
		System.out.println("----------------------------------------------------------");
		System.out.println(pqueueRev);
		System.out.println("----------------------------------------------------------");
		System.out.println(pqueueRev.peek());//1500
		System.out.println(pqueueRev.peek());//1500-gives the top element in queue(highest priority) number from queue
		System.out.println(pqueueRev.poll());//1500
		System.out.println(pqueueRev.poll());//555
		
		
		
	}

}


