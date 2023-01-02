package Method;

import java.util.ArrayList; // ArrayList�� *�� �ص� ��밡��
import java.util.Collections;
//�ڷᱸ�� 
public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>(); // ���ڿ����� ������x
		
		
		list.add("aaa");
		list.add("bbb");
		list.add("aaa");

		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list);
		//����
		Collections.sort(list);
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		System.out.println(list.contains("aaa")); //���� �Ǿ��ִ°�
		System.out.println(list.indexOf("aaa")); // aaa�� ã�Ƽ� ���ý� ��ó������ ǥ���ؼ�  0�̳���  (0 aaa 1 bbb 2 aaa)
		System.out.println(list.isEmpty()); //����ִ°� Ȯ��
		
		list.set(0, "ccc"); //0���ڸ� ccc �� ����
		System.out.println(list);
		list.remove(0); // 0���ڸ� ����
		System.out.println(list);
		System.out.println();
		
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //��������
		list2.add(new Integer(1));
		list2.add(new Integer(20));
		list2.add(100);
		System.out.println(list2);
		System.out.println(list2.indexOf(20));
		//����
		Collections.sort(list2);
		System.out.println(list2);
		
		// � Ŭ�������� �˻��� �ǰ� ���ĵ� �� �����ѵ� � Ŭ�������� �ȉ�
		
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
		
		//����
		Collections.sort(list3);
		System.out.println(list3);
		
	
	}

}
