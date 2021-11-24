package Collection;


public class Collection_Stack02 {
	
	public static void main(String[] args) {
		
		//[Collection_Stack02]
		//MyStack
		
		MyStack stack = new MyStack();
		//System.out.println(stack);
		
		stack.push("홍길동");
		//System.out.println(stack);
		
		stack.push("아무개");
		stack.push("테스트");
		//System.out.println(stack);
	
		System.out.println("size: " + stack.size());
	
	
		//get() + remove() = pop()
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("size: " + stack.size());

		System.out.println(stack);
		
		stack.push("관리자");
		System.out.println(stack);
		
		
		System.out.println(stack.peek());
		
		
		System.out.println(stack.contains("관리자"));
		System.out.println(stack.contains("홍길동"));
		System.out.println(stack.contains("테스트"));
		
		
		//System.out.println(stack.clear());
		System.out.println(stack);
		
		stack.push("홍길동");
		System.out.println(stack);

		
		//더이상 stack에 데이터를 추가할 일이 없다 > 확신 > 길이 줄이기
		stack.trimToSize();
		System.out.println(stack);
		
		stack.push("아무개");
		System.out.println(stack);
		
	}//main

}

class MyStack {
	
	//후입선출
	private String[] list;
	private int index;
	
	public MyStack() {
		this.list = new String[4];
		this.index = 0; //4칸짜리 방 초기화 작업
	}
	
	public void trimToSize() {

		//확장 로직의 반대
//		String[] temp = new String[데이터가 들어있는 크기만큼..];
		
		//실제 데이터가 들어있는 만큼의 길이를 가지는 배열
		String[] temp = new String[this.index];
		
		for (int i=0; i<temp.length; i++) {
			temp[i] = this.list[i];
		}
		
		this.list = temp;
	}

	
	public void clear() { 
		
		this.index = 0;
	}

	public boolean contains(String s) {
		
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(s)) {
				return true;
			}
		}
		return false;
	}

	public String peek() {

		String temp = this.list[this.index - 1]; //읽기
		
		return temp;
	}

	public String pop() {

		//읽기 + 삭제
		//this.index - 1 > 마지막에 넣은 데이터의 방 번호
		String temp = this.list[this.index - 1]; //읽기
		//this.list[this.index - 1] = null; //삭제 > 선택
		this.index--; //삭제겸함
		
		return temp;
		
	}

	public int size() {
		
		return this.index;
		
	}
	
	public void push(String s) {

		//ArrayList의 add()와 동일
		
		//1. 공간 체크
		//2. 요소 추가
		
		if (this.index >= this.list.length) {
			String[] temp = new String[this.list.length*2];
			for (int i=0; i<this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp; //2배 늘리기 작업
		}
		this.list[this.index] = s;
		this.index++;
	}

	@Override
	public String toString() {
		String temp = "";
		
		temp += "length: " + this.list.length + "\r\n";
		temp += "index: " + this.index + "\r\n";
		temp += "[\r\n";
		for (int i=0; i<this.list.length; i++) {
			temp += "   " + i + ":" + this.list[i] + "\r\n";
		}
		temp += "]";
		
		return temp;
	}
	
	
}