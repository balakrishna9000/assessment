package assessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class StudentMapMain {


	public static void main(String[] args) {
		
		Map<String,age> map = new HashMap<>();
		Student student1 = new Student("abcd", 10);
		Student student2 = new Student("efgh", 11);
		Student student3 = new Student("hijk", 4);
		Student student4 = new Student("lmno", 12);
		Student student5 = new Student("qrst", 15);
		map.put(10, student1);
		map.put(11, student2);
		map.put(4, student3);
		map.put(12, student4);
		map.put(15, student5);

		System.out.println("size="+size);
		
    	Set<String> keys=map.KeySet();
		
		for(Integer age:map.keySet()) {

			if(Student.age%2==0) {
				System.out.println("key:" +age);
			}
			else {
				System.out.println("key:" +age);
			}
		}
		List<String>student =new ArrayList<String>();
		for(int i=0;i<student.size();i++) {
			System.out.println(student.getRollno);
					
		}
	}
}
