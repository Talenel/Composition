
public class Tester {
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Education edu= new Education();
		Schooling s1=new Schooling("Hood College", 2017, "BS", "CS");
		Schooling s2=new Schooling("Columbia U", 2021, "MS", "CS");
		edu.addSchooling(s1);
		edu.addSchooling(s2);
		Job director=new Job("Director", "Teach budding programmers", 50000, 001);
		
		Person guy = new Person("The Dude",director, edu);
		System.out.println(guy);
		

	}

}
