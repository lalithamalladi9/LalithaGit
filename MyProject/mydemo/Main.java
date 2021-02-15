package mydemo;

public class Main {

	public static void main(String[] args) {
		
		// Example of Composition
		Person p= new Person();
		p.talk();
		p.walk();
		p.eat();
		
		MathTeacher m= new MathTeacher();
		m.teachMath();
		
		Footballer f = new Footballer();
		f.playFootball();
		
		Businessman b = new Businessman();
		b.runBusiness();
		
		
	}

}
