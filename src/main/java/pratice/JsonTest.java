package pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonTest {
	
	
	public static void main(String[] args) {
		
		// 쉽게 JSON 객체를 생성할 수 있다
		JSONObject obj = new JSONObject();
		
		obj.put("name", "홍길동");
		obj.put("age", 40);
						
		System.out.println(obj);
		
		// 자바의 Map을 바로 JSON 형태 문자열로 변환해준다
		Map<String, Object> map = new HashMap<>();
		// 자바스크립트에 배열로 전달하고 싶을때는 List를 사용한다
		List<String> hobbies = new ArrayList<>();
		// 객체 내부에 객체를 넣을 수 있다
		Map<String, Object> car = new HashMap<>();
		
		car.put("carName", "스포티지");
	    car.put("carNumber", "12가1234");
	    car.put("carAge", 8);
		
		hobbies.add("농구");
		hobbies.add("야구");
		hobbies.add("배구");
		
		map.put("name", "임꺽정");
		map.put("phone", "123-1234-1234");
		map.put("age", 33);
		map.put("hobby", hobbies);
		map.put("car", car);
		
		String jsonStr = new JSONObject(map).toJSONString();
		
		System.out.println(jsonStr);
		
		// JSON 형식 문자열 = > JSONObject로 만들기 (파싱, Parse)
		JSONParser parser = new JSONParser();
		
		try {
			JSONObject parsed = (JSONObject)parser.parse(
					"{\"fruit\":\"apple\",\"drink\":\"ade\""
					+ ",\"flavor\":[3,5,6,11]}");
			System.out.println("JSON 문자열로 객체 만들어서 자바에서 활용하기");
			System.out.println(parsed.get("fruit"));
			System.out.println(parsed.get("drink"));
			
			System.out.println("JSON 배열값 꺼내서 활용해보기");
			List<Integer> flavorNums = (List<Integer>)parsed.get("flavor");
			
			for (int i = 0; i < flavorNums.size(); ++i) {
				System.out.println(flavorNums.get(i));
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
