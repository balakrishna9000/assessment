package assessment;

public class StudentMap {
	private String rollno;
	static int age;

	public void Student(String rollno, int age) {
		this.rollno = rollno;
		this.age = age;
	}

	public void Student() {
		this(" ", 0);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	@Override
	public int hashCode() {
		int hash = rollno.hashCode();
		return hash;
	}

	public boolean equals(Object arg) {
		if (this==arg) {
			return true;
		}
		if(arg==null||(arg instanceof Student)) {
			return false;
		}
		Student that=(Student)arg;
		boolean isequal=this.rollno(that.rollno);
		return isequal;
	}

}
