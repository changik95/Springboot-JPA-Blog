package Method;
// String 클래스의 사용
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
		//System.out.println(a);	// 초기화 되지 않은 local 변수
		System.out.println(b);
		System.out.println(c);
		//System.out.println(b.length()); //null 인 변수를 객체로 사용하려고 하면 안됌	
		int n = c.length();
		System.out.println(d);	
		System.out.println(d.length());	
		
		System.out.println(d == e);	
		System.out.println(f == g);	
		System.out.println(f.equals(g)); //내용을 비교할때는 f.equals(g) 이런식으로
		System.out.println(f.equalsIgnoreCase("ABC"));  //대소문자 무시하고 비교	
		System.out.println(f.contains("ab"));			// 포함되어 있는지
		System.out.println(f.startsWith("ab"));			// 시작하는지
		System.out.println(f.indexOf("ab"));			// 위치검색 int 리턴함 abc를 찾을경우 0 이나옴 0 = a a를 찾았다는것임
		System.out.println(f.indexOf("xxx"));			// 위치검색  -1은 못찾았다는것임
	*/	
		System.out.println(f.compareTo("abaaaa"));			// 코드값 또는 문자열 길이의 차이 
		System.out.println(f.compareTo("abcdefg"));		//
		
		a = "abc123ABC";		
		
		System.out.println(a.charAt(2)); //a번째의 문자를 가져옴
		System.out.println(a.substring(6)); // a번째 이후부터 출력함
		System.out.println(a.substring(3,5)); //a번째 이후,a번째 이후부터 출력함
		System.out.println(a.toUpperCase()); // 대문자로 새로운 객체를 만듬 원본을 변환 시킬순없음
		System.out.println(a.replaceAll("12","89")); //치환 
		
		a = a.toUpperCase();
		System.out.println(a);
		
		 a = "010-1234-5678";
		 String ar[] = a.split("-"); //특정문자 기준으로 배열요소 생성
		 
		 System.out.println(ar[0]);
		 
		 //String -> int로 변환
		 String n1 = "111";
		 String n2 = "222";
		 
		 //int n = n1 + n2;
		 int nn = Integer.parseInt(n1) + Integer.parseInt(n2);
;		 System.out.println(nn);

		 System.out.println(n1 + n2);
	}

}
