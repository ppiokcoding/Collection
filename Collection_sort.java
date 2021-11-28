package Collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Collection_sort {
	
	public static void main(String[] args) {
		
		//[sort]
		
		
		//배열 or 컬렉션
		Integer[] nums = { 1, 5, 2, 4, 3 };
		
		//오름차순 정렬
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));

		
		//내림차순 정렬
		//1) 첫번째 방법 - 클래스를 따로 생성
		Arrays.sort(nums, new MyComparator());
		System.out.println(Arrays.toString(nums));
		
		//이 객체는 아래와 같이 독립적으로 사용할 일이 전혀 없다.
		MyComparator m = new MyComparator();
		m.compare(10, 20);
		
		
		//2) 두번째 방법 - 1회용 객체, 깔끔함
		Arrays.sort(nums, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
			
		});
		
		//즉, 클래스를 밖에다 만드느냐 안에다가 한번쓰고 버리느냐의 차이
		
		ArrayList<Item> list = new ArrayList<Item>();
		
		list.add(new Item(10, "사과"));
		list.add(new Item(50, "귤"));
		list.add(new Item(20, "포도"));
		list.add(new Item(30, "파인애플"));
		list.add(new Item(40, "딸기"));
		
		
		System.out.println(list);
		
		//정렬 - 오름차순
		//Collections.sort(list);
		//System.out.println();
		
		//System.out.println(list);
		//System.out.println();
		
		
		list.sort(new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getNum() - o2.getNum();
			}
		});

		System.out.println(list);
		
		
	}//main

}

//첫번째 방법
class MyComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 - 02;
	}

}



//정렬 > 비교 > 인처페이스 상속
//1. Comparator > 외부에서 객체들을 서로 비교하는 역할  -> 매개변수 2개
//2. Comparable > 객체 스스로가 비교 대상이 되기 위해서 -> 매개변수 1개

class Item { //implements Comparable<Item>{ 
	
	private int num;
	private String txt;
	
	public Item(int num, String txt) {
		this.num = num;
		this.txt = txt;
	}
	
	@Override
	public String toString() {

		return String.format("{num:%d,txt:%s}", this.num, this.txt);
	}

	
	//getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getTxt() {
		return txt;
	}

	public void setTxt(String txt) {
		this.txt = txt;
	}

//	@Override
//	public int compareTo(Item o) { //얘는 매개변수가 1개
//
//		return this.getNum() - o.getNum();
//	}
//


	}