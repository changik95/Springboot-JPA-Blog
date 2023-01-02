//HashMap Å¬·¡½º 
package Method;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(new Integer(1), "È«±æµ¿");
		map.put(2, "±èÃ¶¼ö");
		map.put(3, "ÀÌ¿µÈñ");
		System.out.println(map);		
		
		System.out.println(map.get(1));		
		map.remove(1);
		System.out.println(map);
		
		Map<String,Integer> map2 = new HashMap<>();
		
		map2.put("c",5);
		System.out.println(map2);
		
		
	}
}
