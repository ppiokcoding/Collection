package Collection;


import java.util.ArrayList;
import java.util.Iterator;

public class Collection02 {
	
	public static void main(String[] args) {
		
		
		//[Collection]
		
		//컬렉션 탐색 도구
		//1. for문 (index)
		//2. while문
		//3. 향상된 for문
		//-------------------------- 제어문
		
		//4. Enumeration
		//5. Iterator (*********)
		//6. ListIterator
		//-------------------------- 도구
		
		
		m1();	//Iterator
		
		
	}//main

	private static void m1() {

		//Iterator
		//- List, Set에서 사용
		//- 읽기 전용으로 사용
		//- 향상된 for문 유사
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("노트북");
		list.add("마우스");
		list.add("키보드");
		list.add("모니터");
		list.add("웹캠");
		
		//Iterator를 지원하는 데이터 집합 > iterator() 메소드 소유
		Iterator<String> iter = list.iterator();
		
		//Iterator객체의 메소드 2개
		//1. hasXXX()
		//2. nextXXX()
		
		//커서
		//- 전진 커서 (다음 방으로만 이동 가능, 이전 방으로는 못 돌아간다.)
		
		//1.
		/*
		System.out.println(iter.hasNext()); //true - 데이터 확인용
		System.out.println(iter.next()); // 노트북
	
		System.out.println();
		
		System.out.println(iter.hasNext()); //true
		System.out.println(iter.next()); //마우스
		
		System.out.println();
		
		System.out.println(iter.hasNext()); //true
		System.out.println(iter.next()); //키보드
		 
		System.out.println(iter.hasNext()); // ture
		System.out.println(iter.next()); //모니터
		
		System.out.println();
		
		System.out.println(iter.hasNext()); //true
		System.out.println(iter.next()); //웹캠
		
		System.out.println();
		
		System.out.println(iter.hasNext()); //false
		System.out.println(iter.next()); //Error 
		
		*/
		
		
		//2. 다른 방법 : iterator를 사용한 탐색
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (String item: list) {
			System.out.println(item);
		}
		
	}
	

}
