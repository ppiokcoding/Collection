package Collection;


public class Collection_Anonymous {
	
	public static void main(String[] args) {
		
		
		//[Anonymous]
		/*
		 
		 익명 객체, Anonymous Object
		 - 익명 클래스, Anonymous Class
		 - 이름이 없는 객체(클래스)
		 - 반드시 인터페이스가 필요하다. (문법의 한계때문에)
		 
		 
		 실명 클래스
		 - 메소드 역할 > 모든 객체가 동일한 행동을 하기 위해서
		 - 객체를 여러개 생성하는 것이 목적
		 
		 익명 클래스
		 - 메소드 역할 > 모든 객체가 *서로 다른 행동*을 한다. 겉모습만 똑같고 내용물이 다르다.
		 - 객체를 딱 ***1개**** 생성하는 것이 목적
		 - 1회용 객체가 필요할 때 사용 (딱 한번만 붕어빵을 찍고싶을때!!)
		 		> 붕어빵 하나 먹으려고 무거운 쇠틀(=실명 클래스)사는 것은 굉장히 비효율적
		  		> 그런데 익명클래스로 만든 이 클래스는 1회용 붕어빵틀이 됨
		 - 1회용 붕어빵 틀 
		 
		 */
		
		//User obj = new User();
		//?? obj = new ??();
		
		//*** 인터페이스를 구현(상속)한 클래스 > 객체를 생성 
		//1. 본인 타입으로 참조변수를 만들기
		BBB b1 = new BBB();
		b1.test();
		b1.call();
		
		//2. 부모 타입으로 참조변수 만들기 > 인터페이스 > 업캐스팅
		AAA b2 = new BBB(); 
		b2.test();
		
		//b2.call(); 
		//안됨 왜? 
		//우리는 실존하는 객체가 어떤 타입이든 AAA를 통해서 오른쪽을 바라봄 
		//b2라는 변수에는 call이라는 메소드가 없다. 부모변수로 참조했을땐 자식만이 가지는 멤버에는 접근 못함 
		//부모 찹입의 변수로는 자식 객체가 스스로 만든 멤버에는 접근 불가능

		//다운 캐스팅
		BBB b3 = (BBB)b2;
		b3.call();
		
		//(BBB)b2.call(); //이렇게 하면 b2.어쩌구부터 실행함 그래서 에러
		((BBB)b2).call(); //그러면 우선순위를 높혀주면 해결됨!
		
		
		//인터페이스는 스스로 객체를 생성할 수 없다.
		//	 	> 추상메소드를 소유하는 자료형(인터페이스, 추상클래스)은 객체를 생성할 수 없다. 
		//		> 추상 메소드를 호출하면 구현부가 없기 때문에,,,
		//AAA b4 = new AAA(); //error
		//b4.test();
		// = 공갈메소드 
		//b4를 통해서 테스트를 호출하러가면  inteface AAA{} 로 가는데 실행할 내용이 없다.
		
		
		//-------------------------------------
		
		
		//1.
		//		이름없는 클래스 => 그래서 부모인 인터페이스의 이름을 빌려다가 쓴것 그래서 어떤 인터페이스의 자식클래스로만! 인터페이스가 시킨 메소드를 구현해야함
		AAA b5 = new AAA() { //The type new AAA(){} must implement the inherited abstract method AAA.test(
							 //= 구현안한 메소드를 추가하세요	

			@Override
			public void test() {
				System.out.println("익명 객체 메소드");
			}
			
		}; //BBB랑 비슷한 형제뻘되는 객체가 됨
		   //이름 없는 이 표현은 암시적으로 AAA라는 인터페이스를 상속받아만든 오브젝트이다
	
		b5.test();
	
		
		//2.
		
		AAA b6 = new AAA() {
			@Override
			public void test() {

				System.out.println("자신만의 구현 내용");
			}
		};
		
		
		//익명객체는 오브젝트를 만드는 그 당시에 메소드를 그때마다 구현한다. 그래서 똑같은 익명객체지만 각 테스트의 메소드결과물이
		//서로 다르다. 그러면 같은것은 부모가 물려준 메소드의 껍데기만 똑같다. 안의 내용은 익명객체에따라 
		//서로 다른 내용을 가지게 됨
		
		//--------------------------------------
	
	
	
	}//main

}

//class {
//	
//}


interface AAA {
	
	void test(); //추상메소드
	
}

class BBB implements AAA {

	@Override
	public void test() {
		System.out.println("테스트");
	
	}
	
	
	public void call() {
		System.out.println("자신의 메소드");
	}

}//BBB

