package advance.java8feature.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LambdaSloution {

	public static void main(String[] args) {
		Map<String, Integer> emp = new HashMap<String, Integer>();
		emp.put("Anny", 35);
		emp.put("John", 20);
		emp.put("David", 27);

		//create Set from Map Entry 
		Set<Entry<String, Integer>> set_emp = emp.entrySet();
		//create List from Set
		List<Entry<String, Integer>> list_emp = new ArrayList<Entry<String, Integer>>(set_emp);

		System.out.println("Emp list - before");
		list_emp.stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));

		//functional interface - Comparator implemented in new anonymous class
//		Collections.sort(list_emp, new Comparator<Map.Entry<String, Integer>>() {
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getValue().compareTo(o2.getValue());
//			}
//		});

		//lambda expression - compare method implemented through lambda expression
		list_emp.sort((Entry<String, Integer> o1, Entry<String, Integer> o2) -> o1.getValue().compareTo(o2.getValue()));

		System.out.println("\nEmp list - after");
		list_emp.stream().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
	}

}
