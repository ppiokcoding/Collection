package Collection;

import java.util.HashMap;

public class Collection_HashMap {

	public static void main(String[] args) {
		
		//[HashMap]
		
		/*
		 
		 컬렉션 > ArrayList, HashMap 메인 > 나머지 컬렉션 서브..
		 
		 1. ArrayList
		 	- 요소 접근 > 첨자(index) 사용
		 	- 순서가 있는 데이터 집합
		 	- 첨자(index) > 정수 사용(0부터 시작)
		 	- 스칼라 배열(Scalar Array)
		 	- 방을 일괄 접근 용이 > for 루프
		 	- 요소끼리 구분이 모호함 > 방 번호는 의미를 가지지 않기 때문에
		 	 ex) 강의실 6개 > 1강의실, 2강의실, ..., 6강의실
		 	 	 방번호를 숫자로 가짐
		 	
		 	
		 2. HashMap
		 
		 	- 요소 접근 > 키(key) 사용
		 	- 방번호가 존재하지 않는다. > 요소의 순서가 없다. > 단점x 특징o!!
		 	- 키(key)와 값(value)으로 (한쌍)데이터를 관리
		 	 ex) 강의실 6개 > 자바반, 파이썬반, DB반, ..., 이름으로! 이 이름을 key라고 함
		 	 	 유치원 - 햇님반, 튤립반, 달님반 등...
		 	 	 방번호를 이름으로 가짐
		 	- 방을 일괄 접근 불리 > 루프 불가능
		 	- 요소의 의미를 알기 쉽다(************) > 이름(key) 	 
		 	- key가 유일해야 한다. (왜? 방을 구분하는 식별자이기 때문)
		 	=> 강의실이 값임 즉 강의실의 데이터값을 찾기 위한 것임
		 	
		 
		 */
		
		
		m1();
	}//main

	private static void m1() {


		HashMap<String, Integer> map = new HashMap<String, Integer>();
		//당연히 얘도 가변임. 길이가 늘었다 줄었다 함 계속 더블링
		
		//1. 요소 추가
		// - U put(T key, U value)
		//map.put("방의이름", 데이터);
		
		map.put("국어", 100); //배열에 데이터(= 100)를 추가하는 중, '국어'는 방의 이름(key)
		map.put("영어", 90);
		map.put("수학", 80);
		
		
		//4. 요소 수정
		// - U put(T key, U vlaue)
		// - 동일한 key를 사용하면 수정이 된다.
		map.put("국어", 99); //데이터의 개수가 3개가 되고 국어 점수가 99점이 된다.
		//즉, 이 행동은 요소를 수정 한것
		
		
		
		//2. 요소 개수
		// - int size()
		System.out.println(map.size()); // 100, 90, 80
		
		
		//3. 요소 접근
		// - U get(T key)
		//System.out.println(list.get(0));
		System.out.println(map.get("국어"));
		System.out.println(map.get("영어"));
		System.out.println(map.get("수학"));
		
		//5. 검색
		//방번호가 없으니 indexOf가 없다.
		//대신
		// - boolean containsKey(T key)
		// - boolean containsValue(U value)
		System.out.println(map.containsKey("국어")); //true
		System.out.println(map.containsKey("사회")); //false
		
		
		System.out.println(map.containsValue(100)); //100점맞은거 있어?
		System.out.println(map.containsValue(99));  //99점맞은거 있어?
		
		//6. 삭제
		// - U remove(T key)
		map.remove("국어");
		
		//첫번째 확인법
		System.out.println(map.size()); // 3과목 -> 2과목됨
		
		//두번째 확인법
		//모든 컬렉션의 toString() 재정의(오버라이딩)되어 있음
		System.out.println(map.toString()); //dump 되어 있다.
		
		
		//7. 초기화
		
		map.clear();
		System.out.println(map.size());
		//System.out.println(map.toString());
		System.out.println(map); //toString()적을 필요없다. 자동호출되므로!!
		
	}
	
}
