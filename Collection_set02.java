package Collection;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Collection_set02 {
	
	public static void main(String[] args) {

		// [Set02]

		// TreeSet
		// - Tree 구조를 가지는 Set
		// - 중복값x, 순서x, 정렬x
		// - 이진 트리 구조 기반의 자동 정렬이 가능한 Set
	
		Set<Integer> set = new TreeSet<Integer>();
		
		set.add(100);
		set.add(400);
		set.add(200);
		set.add(300);
		set.add(500);
	
		System.out.println(set.size());
		
		Iterator<Integer> iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
			System.out.println();
	
			
			//TreeSet 특징
			//1. 정렬
			//2. 부분 검색 용이(****)
			
			TreeSet<Integer> tree = (TreeSet<Integer>)set;
			
			System.out.println(tree.first());
			System.out.println(tree.last());
			System.out.println(tree.headSet(300)); //미포함
			System.out.println(tree.tailSet(300)); //포함
			System.out.println(tree.subSet(200, 400));
			
			//List -> ArrayList(*****), LinkedList(***), Vector, Stack(***), Queue(***)
			//Set -> HashSet(***), TreeSet(*)
			//Map -> HashMap(*****), TreeMap(*), HashTable, Properties
			
	
	
	}//main
}
