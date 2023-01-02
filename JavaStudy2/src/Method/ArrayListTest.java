package Method;

import java.util.ArrayList; // ArrayList를 *로 해도 사용가능
import java.util.Collections;
//자료구조 
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); // 문자열저장 정수는x
		
		
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");

		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list);
		//정렬
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list.contains("aaa")); //포함 되어있는가
		System.out.println(list.indexOf("aaa")); // aaa를 찾아서 나올시 젤처음것을 표현해서  0이나옴  (0 aaa 1 bbb 2 aaa)
		System.out.println(list.isEmpty()); //비어있는가 확인
		
		list.set(0, "ccc"); //0번자리 ccc 값 넣음
		System.out.println(list);
		list.remove(0); // 0번자리 삭제
		System.out.println(list);
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //정수저장
		list2.add(new Integer(1));
		list2.add(new Integer(20));
		list2.add(100);
		System.out.println(list2);
		System.out.println(list2.indexOf(20));
		//정렬
		Collections.sort(list2);
		System.out.println(list2);
		
		// 어떤 클래스들은 검색도 되고 정렬도 다 가능한데 어떤 클래스들은 안됌
		
		ArrayList<Product> list3 = new ArrayList<>();
		list3.add(new Product("aaa", 1000));
		list3.add(new Product("bbb", 2000));
		list3.add(new Product("ccc", 3000));
		System.out.println(list3);
		
		System.out.println(list3.get(0));
		System.out.println(list3.contains(new Product("bbb", 2000)));
		System.out.println(list3.indexOf(new Product("bbb", 2000)));
		
		list3.remove(2);
		System.out.println(list3);
		list3.remove(new Product("aaa", 1000));
		System.out.println(list3);
		
		//정렬
		Collections.sort(list3);
		System.out.println(list3);
		
	
	}

}
