package thisex;

public class Ex1 {
	public static void main(String[] args) {
		Birthday day = new Birthday();
		System.out.println(day);
		day.printThis();
		// 참조변수와 this는 같은 값이 출력됨
		// this는 자기 자신을 가리키는 키워드
	}
}

class Birthday {
	private int year;
	
	// 멤버변수와 매개변수의 이름이 같을때
	public void setYear(int year) {
		// 변수이름이 같을때는 this 키워드를 사용하여 구분
		this.year = year;
	}
	
	public void printThis() {
		System.out.println(this);
	}
	
}