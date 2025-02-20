package thisex;

public class Ex2 {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setName("둘리");
		
		System.out.println(person);
		person.printThis();
	}

}

class Person {
	private String name;
	
	// 이름을 변경하는 함수
	public void setName(String name) {
		this.name = name;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}