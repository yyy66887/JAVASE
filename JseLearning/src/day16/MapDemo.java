package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args){
		Map<String,String> map =new HashMap<String, String>(); 
		map.put("110", "adfad");
		map.put("123", "asdfaf");
		map.put("134", "wre");
		map.put("324", "rew");
//		Set<String> s = map.keySet();
//		Iterator<String> it = s.iterator();
//		while(it.hasNext()){
//			String key = it.next();
//			System.out.println(key+"------"+map.get(key));
//		}
//		System.out.println(map);
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,String>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> me = it.next();
			System.out.println(me.getKey()+":::"+me.getValue());
		}
		
	}

}
