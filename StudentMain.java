package assessment;

import java.util.Set;
import java.util.HashSet;
import java.util.List;
public class StudentMain {
	

	Set<Student> set=	new HashSet<Student>();
	public void runApp() {
		try {
		Student student1 = new Student("abcd", 21);
		set.add(student1);
		Student student2 = new Student("efgh", 21);
		set.add(student2);
        Student student3 = new Student("mnop", 22);
        set.add(student3);
		Student student4 = new Student("qrst", 22);
        set.add(student4);
        List<Student>list =toList(set);
        
        Iterator<student> iterator =set.iterator();
        
	    while(iterator.hashNext()) {
	    	Student student =iterator.next();
	    	System.out.println("Age="+student.getAge()+" "+"rollno"+ student.getRollno());
	    }
	    
     public static void main(String args[]) {
    	 StudentMain run =new StudentMain();
    	 run.runApp;
     }
}