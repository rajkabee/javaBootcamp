package javaSE.loops.oop;

public class Classes {
	public static void main(String[] args) {
		Person p = new Person();
		p.age = 123;
		p.name = "Ramesh";
		p.display();
		Person p2 = new Person(45, "Saurav");
		
		p2.display();
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		e1.dept="accounts";
		e2.dept="Operation";
		Employee.dept="management";
		System.out.println(e1.dept);
		System.out.println(e2.dept);
		Security s = new Security();
		s.
		
	}
	
	static class Person{
		int age;
		String name;
		

		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		


		public Person() {
		}



		public void display() {
			System.out.println(name+"\t"+age);
		}
	}
	
	
	
	
	
	
	
}
