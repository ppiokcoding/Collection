package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Collection01 {
	
	public static void main(String[] args) {
		
		//[Collection]
		/*
		 
		 1. ArrayList
		 2. HashMap
		 3. Stack
		 4. Queue
		 
		 
		 자바 컬렉션의 관련 인터페이스
		 1. Collection
		 	- List와 Set의 부모 인터페이스
		 	
		 2. List
		 	- ArrayList, Stack, Queue, LinkedList, Vector
		 	- 순서가 있는 데이터 집합(*********)
		 	- 방번호가 있다. > 첨자(index)를 사용한다. > 요소 접근
		 	- 순수 배열과 유사
		 	- 데이터 중복을 허용한다. > 방번호가 유일하기 때문에 동일한 데이터라도 방번호를 통해서 구분한다.
		 
		 3. Set
		 	- HashSet, TreeSet
		 	- 순서가 없는 데이터 집합
		 	- 방번호가 없다. 첨자 사용 안함
		 	- 데이터 중복을 허용하지 않는다. (*******)

		 4. Map
		 	- HashMap, TreeMap, HashTable, Properties
		 	- 순서가 없는 데이터 집합
		 	- 방번호가 없다 > 키를 사용한다.
		 	- 키와 값을 사용 > 연관 배열, 사전 구조(딕셔너리)
		 	- key(= 단어) -> value(= 뜻)
		 	- 키(key) : 식별자 역할 > 유일해야 한다.
		 	- 값(value): 데이터 > 중복 허용한다.
		 	
		 	
		 ** vector, HashTable, Properties: 호환성때문에 남겨진 클래스 > 언젠가 사라질 예정
		 
		 자바 컬레션 > JDK 1.5
		 
		 Vector > ArrayList
		 HashTable > HashMap
		 Properties > XMl, JSON 대체
		 
		 */
		
		//m1();		//Vector
		//m2();		//LinkedList ** + ArrayList 차이 설명
		m3();		//ArrayList VS LinkedList 작업 시간 차이 보기
		
	}//main

	private static void m3() {

		//ArrayList VS LinkedList
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		
		
		long begin = 0, end = 0;
		
		//1. 순차적으로 데이터를 추가하기(append)
		//1)
		System.out.println("[순차적으로 데이터를 추가하기]");
		
		begin = System.nanoTime();
		
		
		for (int i=0; i<1000000; i++) {
			nums1.add(i); //배열의 끝에 추가 > Append
		}
		
		end = System.nanoTime();
		System.out.printf("ArrayList 작업 시간: %, dns\r\n", end - begin);
		
		
		//2)
		begin = System.nanoTime();

		for (int i = 0; i < 1000000; i++) {
			nums2.add(i); // 배열의 끝에 추가 > Append
		}

		end = System.nanoTime();
		System.out.printf("LinkedList 작업 시간: %, dns\r\n", end - begin);
		
		System.out.println();
		
		//----------------------------------------------------------------------
		
		//2. 배열 중간에 데이터를 추가하기(insert + shift 발생)
		//1)
		System.out.println("[배열 중간에 데이터를 추가하기]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			nums1.add(0, i); // 배열의 끝에 추가 > Append
		}

		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업 시간: %, dms\r\n", end - begin);
		
		
		
		//2)
		System.out.println("[배열 중간에 데이터를 추가하기]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			nums2.add(0, i); // 배열의 끝에 추가 > Append
		}

		end = System.currentTimeMillis();
		System.out.printf("LindedList 작업 시간: %, dms\r\n", end - begin);
		
		System.out.println();
		//----------------------------------------------------------------------
		
		//3. 배열 중간에 데이터를 삭제하기(delete + shift 발생)
		
		//1)
		System.out.println("[배열 중간에 데이터를 삭제하기]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			nums1.remove(0); // 배열의 끝에 추가 > Append
		}

		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업 시간: %, dms\r\n", end - begin);
		
		//2)
		System.out.println("[배열 중간에 데이터를 삭제하기]");

		begin = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			nums2.remove(0); 
		}

		end = System.currentTimeMillis();
		System.out.printf("LindedList 작업 시간: %, dms\r\n", end - begin);
		
		System.out.println();
		
		//-----------------------------------------------------------------
		//4. 순사적으로 데이터를 삭제하기. 끝 -> 처음. shift 발생 안되게..

		// 1)
		System.out.println("[순차적으로 데이터를 삭제하기]");

		begin = System.currentTimeMillis();

		for (int i = nums1.size()-1; i >=0; i--) {
			nums1.remove(i); 
		}

		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업 시간: %, dms\r\n", end - begin);

		
		// 2)
		System.out.println("[순차적으로 데이터를 삭제하기]");

		begin = System.currentTimeMillis();

		for (int i = nums1.size()-1; i >=0; i--) {
			nums2.remove(i);
		}

		end = System.currentTimeMillis();
		System.out.printf("LindedList 작업 시간: %, dms\r\n", end - begin);

		System.out.println();
		
		
		//개별 요소 탐색
		for (int i=0; i<10000000; i++) {
			nums1.add(i); // 배열의 끝에 추가 > Append
		}
		
		for (int i=0; i<10000000; i++) {
			nums2.add(i); // 배열의 끝에 추가 > Append
		}
		
		begin = System.nanoTime();
		System.out.println(nums1.get(500000));
		end = System.nanoTime();
		System.out.printf("ArrayList 작업 시간: %,dns\r\n", end - begin);

		begin = System.nanoTime();
		System.out.println(nums2.get(5000000));
		end = System.nanoTime();
		System.out.printf("LinkedList 작업 시간: %,dns\r\n", end - begin);
		
		System.out.println();
		
	}//m3

	
	private static void m2() {

		//List 계열의 대표 컬렉션
		
		//- 같은 인터페이스 상속 > 동일한 추상 메소드 구현 > 사용법 유사
		//1. ArrayList
		//2. LinkedList
		
		//LinkedList 종류
		//1. LinkedList : 일방	
		//2. Double LinkedList : 양방향
		//3. Double Circular LinkedList : 양방향 + 처음 ~ 끝 연결
		
		//자바의 LinkedList는 Double Circular LinkedList이다. > 그래서 탐색이 용이하다. 
		
		//ArrayList
		// - 모든 컬렉션을 통틀어 요소에 접근하는 속도가 가장 빠르다.
		// - 요소의 중간 삽입, 삭제에 비용이 많이 발생한다. > Shift 
		
		//LinkedList
		// - 요소에 접근하는 속도가 느리다. (특히 뒤에 있는 요소일수록...)
		// - 요소의 중간 삽입, 삭제에 비용이 저렴하다. > 삭입, 삭제 빈번할때 이것 이용
		
		
		ArrayList<Integer> nums1 = new ArrayList<Integer>();
		LinkedList<Integer> nums2 = new LinkedList<Integer>();
		
		nums1.add(10);
		nums1.add(20);
		nums1.add(30);
		
		nums2.add(100);
		nums2.add(200);
		nums2.add(300);

		
		//ArrayList
		for (int i=0; i<nums1.size(); i++) {
			System.out.println(nums1.get(i));
		}
		
		//LinkedList
		for (int i=0; i<nums2.size(); i++) {
			System.out.println(nums2.get(i));
		}
		
		
		
	}

	private static void m1() {
		
		//Vector	: 동기화 지원함
		//ArrayList : 동기화 지원안함

		ArrayList<String> list1 = new ArrayList<String>();
		Vector<String> list2 = new Vector<String>();
		
		list1.add("홍길동");
		list1.add("가가가");
		list1.add("나나나");
		
		
		list2.add("빨강");
		list2.add("파랑");
		list2.add("노랑");

		System.out.println(list1.size()); 
		System.out.println(list2.size()); 
		
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		
		
		
		
	
	}//m1

}
