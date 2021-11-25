package Collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Collection_Queue {
	
	public static void main(String[] args) {
		
		//[Queue]
		
		/*
		Queue
		 - 선입선출
		 - 먼저 들어간 것이 먼저 나온다.
		 - FIFO, First Input First Output
		*/
		
		//The Stack class represents a last-in-first-out(LIFO) stack of objects.
		Stack<String> stack = new Stack<String>();
		
		//인터페이스
		//- 실제 객체는 LinkedList 형태이고, 외부에 노출된 사용법은 Queue이다.
		Queue<String> queue = new LinkedList<String>();
		
		
		//1. 요소 추가하기
		// - boolean add(T value)
		queue.add("빨강");
		queue.add("노랑");
		queue.add("파랑");
		
		//2. 요소 개수
		// - int size()	
		System.out.println(queue.size());
		
		//3. 요소 읽기
		System.out.println(queue.poll()); //선입선출 -> 빨강
		System.out.println(queue.size()); //공은 똑같이 사라짐 -> 2
		
		System.out.println(queue.poll()); //선입선출 -> 노랑
		System.out.println(queue.size()); //공은 똑같이 사라짐 -> 1
	
		System.out.println(queue.poll()); //선입선출 -> 파랑
		System.out.println(queue.size()); //공은 똑같이 사라짐 -> 0

		if (queue.size() > 0) {
			System.out.println(queue.poll()); //값이 없으면 null값 참고
			System.out.println(queue.size()); //null
		}
		
		if (!queue.isEmpty()) {
			System.out.println(queue.poll()); //값이 없으면 null값 참고
			System.out.println(queue.size()); //null
		}
		
		queue.add("녹색");
		
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		queue.clear();
		System.out.println(queue.size());
		
		//줄서기, 대기열 > Queue 사용
		//음식점 > 주문 > Queue 사용
		
		//주문 -> 주방장 -> 음식 만들기
		//주문 -> 주문대기열 -> 주방장 -> 음식 만들기
		
		
		//Stack
		//- push
		//- pop
		//- size
		//- peek
		
		//Queue
		//- add
		//- poll
		//- size
		//- peek
		
	}//main

}
