package demo;

public class MainDemo {
	public static void main(String[] args) {
		Office office = new Office();
		
		Developer developer = new Developer();
		Tester tester = new Tester();
		
		office.setDeveloper(developer);
		office.setTester(tester);
		
		System.out.println(office.getDeveloper().work());
		System.out.println(office.getTester().work());
		
	}
}
