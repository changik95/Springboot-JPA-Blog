package Method;
// String Ŭ������ ���
public class StringTest1 {

	public static void main(String[] args) {
		String a;
		String b = null;
		String c = "";
		String d = "abc";
		String e = "abc" ;
		String f = new String("abc");
		String g = new String("abc");
	/*	
		//System.out.println(a);	// �ʱ�ȭ ���� ���� local ����
		System.out.println(b);
		System.out.println(c);
		//System.out.println(b.length()); //null �� ������ ��ü�� ����Ϸ��� �ϸ� �ȉ�	
		int n = c.length();
		System.out.println(d);	
		System.out.println(d.length());	
		
		System.out.println(d == e);	
		System.out.println(f == g);	
		System.out.println(f.equals(g)); //������ ���Ҷ��� f.equals(g) �̷�������
		System.out.println(f.equalsIgnoreCase("ABC"));  //��ҹ��� �����ϰ� ��	
		System.out.println(f.contains("ab"));			// ���ԵǾ� �ִ���
		System.out.println(f.startsWith("ab"));			// �����ϴ���
		System.out.println(f.indexOf("ab"));			// ��ġ�˻� int ������ abc�� ã����� 0 �̳��� 0 = a a�� ã�Ҵٴ°���
		System.out.println(f.indexOf("xxx"));			// ��ġ�˻�  -1�� ��ã�Ҵٴ°���
	*/	
		System.out.println(f.compareTo("abaaaa"));			// �ڵ尪 �Ǵ� ���ڿ� ������ ���� 
		System.out.println(f.compareTo("abcdefg"));		//
		
		a = "abc123ABC";		
		
		System.out.println(a.charAt(2)); //a��°�� ���ڸ� ������
		System.out.println(a.substring(6)); // a��° ���ĺ��� �����
		System.out.println(a.substring(3,5)); //a��° ����,a��° ���ĺ��� �����
		System.out.println(a.toUpperCase()); // �빮�ڷ� ���ο� ��ü�� ���� ������ ��ȯ ��ų������
		System.out.println(a.replaceAll("12","89")); //ġȯ 
		
		a = a.toUpperCase();
		System.out.println(a);
		
		 a = "010-1234-5678";
		 String ar[] = a.split("-"); //Ư������ �������� �迭��� ����
		 
		 System.out.println(ar[0]);
		 
		 //String -> int�� ��ȯ
		 String n1 = "111";
		 String n2 = "222";
		 
		 //int n = n1 + n2;
		 int nn = Integer.parseInt(n1) + Integer.parseInt(n2);
;		 System.out.println(nn);

		 System.out.println(n1 + n2);
	}

}
