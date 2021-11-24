package Collection;


import java.util.Stack;

public class Collection_Stack01 {
	
	public static void main(String[] args) {
		
		//[Collection_Stack01]
		/*
		 
		 ADT
		 - 추상적 자료형, Abstract Data Type
		 - 자료구조 중 하나
		 - 물리적인 특성을 가지는 것이 아니라 사용법의 특성을 가진다.
		 - Stack, Queue > 물리구조 == 순수 배열
		 
		 Stack
		 - 후입선출
		 - 나중에 들어간 것이 먼저 나온다.
		 - LIFO, Last Input First Output
		 ex) 메모리 구조(Stack)
		 ex) 되돌리기(Ctrl + Z), 다시하기(Ctrl + Y)
		 ex) 브라우저(뒤로가기, 앞으로가기)
		 
		 		 
		 Queue
		 - 선입선출
		 - 먼저 들어간 것이 먼저 나온다.
		 - FIFO, First Input First Output
		 
		 */
		
		//m1();
		//m2();
		m3();
		
		
		
		
		
	}//main

	private static void m3() {

		//되돌리기(Ctrl + Z), 다시하기(Ctrl + Y)

		//워드 프로세서 작업 중..
		//1. "안넝하세요." 타이핑
		//2. "안넝" 		-> "안녕" 수정
		//3. "." 		-> "," 수정
		//4. "홍길동님" 	-> 추가
		
		Stack<String> history = new Stack<String>();
		Stack<String> redo = new Stack<String>();
		
		
		//1. "안넝하세요." 타이핑
		System.out.println("안넝하세요.");
		history.push("안넝하세요.");
		
		//2. "안넝" -> "안녕" 수정
		System.out.println("안녕하세요.");
		history.push("안녕으로 수정");
		
		//3. "." -> "," 수정
		System.out.println("안녕하세요,");
		history.push("쉼표로 교체");
		
		//4. "홍길동님" -> 추가
		System.out.println("안녕하세요, 홍길동님");
		history.push("홍길동님 추가");
		
		//5. 마지막 작업 되돌리기 > 마지막 작업?
		String temp = history.pop();
		redo.push(temp);
		System.out.println("되돌리기 대상: " + temp);
		
		//6. 또 Ctrl + Z
		temp = history.pop();
		redo.push(temp);
		System.out.println("되돌리기 대상: " + temp);

		//7. 방금 누른 Ctrl + Z 실수함 > 다시 실행
		System.out.println("다시실행 대상: " + redo.pop());
		System.out.println("다시실행 대상: " + redo.pop());
		
		
	}

	private static void m2() {
		
		//Stack
		// - push()
		// - pop()
		// - size()
		// - peek()
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		stack.push("주황");
		stack.push("녹색");
		
		//peek()
		// - pop()처럼 데이터 읽기, 그러나 꺼내지는 않는다. (삭제x)
		// - 역할: 이번에 pop()을 한다면 어떤 데이터가 나올지 미리 구경하는 역할. 
		//		  pop()은 실수로하도 실행을 하는 순간 데이터가 삭제되어버리기 때문에...
		//		  peek()으로 안전하게 체크한 후 pop()를 호출한다.
		System.out.println(stack.peek()); //녹색, pop과 유사 but 차이는
		System.out.println(stack.size()); //5 -> 삭제 하지 않는다.
	
		System.out.println(stack.peek()); //녹색
		System.out.println(stack.peek()); //녹색
		System.out.println(stack.peek()); //녹색
		
		
		
		System.out.println(stack.contains("노랑"));
		System.out.println(stack.contains("파랑"));
		System.out.println(stack.contains("분홍"));
		
		
		//절대 사용하기 말기!!
		//아래의 메소드 사용 > Stack의 용도가 아니게 되기 때문에 사용하지 말것
		//System.out.println(stack.indexOf("노랑"));
		//System.out.println(stack.get(2));
		//stack.clear();

	}

	
	private static void m1() {
		
		Stack<String> stack = new Stack<String>(); //모든 자바컬렉션은 제네릭이다.
		
		//1. 데이터 추가하기
		//- T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		//2. 요소 개수 확인하기
		System.out.println(stack.size()); //3
		
		
		//3. 요소 읽기, 접근하기
		//- T pop()
		System.out.println(stack.pop()); //방번호x + 파랑삭제, 왜? 마지막에 넣은걸 가져오니깐!
		System.out.println(stack.size()); //2, 파랑을 읽은 동시에 삭제 remove가 됨
		
		System.out.println(stack.pop());
		System.out.println(stack.size()); //1, 노랑을 읽은 동시에 삭제 remove가 됨
		
		System.out.println(stack.pop());
		System.out.println(stack.size()); //0, 빨강을 읽은 동시에 삭제 remove가 됨

		// 그래서 stack은 항목을 제거하는 메소드가 따로 존재하지 않음
		// 읽음과 동시에 제거되기 때문에
	
		//스택이 비어 있는지?
		System.out.println(stack.size() == 0);
		System.out.println(stack.isEmpty());
		
		//에러 : EmptyStackException
		//System.out.println(stack.pop());
		
		//둘다 같은 방법임
		//1.
		if (stack.size() > 0) {
		System.out.println(stack.pop());
		}
		
		//2.
		if (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	
	
	}

}
