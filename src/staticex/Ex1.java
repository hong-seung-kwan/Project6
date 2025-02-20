package staticex;

public class Ex1 {

	// 함수도 인스턴스가 생성되어야 사용할 수 있다
	// 하지만 static 메소드는 프로그램이 실행될때 바로 생성되어, 바로 사용할 수 있다!
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.studentName = "둘리";
		System.out.println(student1.studentName + "의 학번: " + student1.studentId);
		
		Student student2 = new Student();
		student2.studentName = "또치";
		System.out.println(student2.studentName + "의 학번: " + student2.studentId);
		
		// static 변수 사용 방법:
		// class이름.static변수
		// static 변수는 인스턴스가 없어도 바로 사용할 수 있다!
		// 하지만 멤버변수는 인스턴스가 있어야 사용할 수 있다
		// 변수를 사용할 수 있는 시점: static / 일반멤버변수
		System.out.println("학생의 수: " + Student.count);
		
		int count = Student.getCount();
		System.out.println(count);
	}

}

// 학생
class Student {
	// 클래스에서 공유하는 공통 속성
	static int count; // 학생의 수
	int studentId; // 학생의 학번
	String studentName; // 학생의 이름
	
	// 생성자
	public Student() {
		// 생성자가 호출이 됬다? 인스턴스가 생성이 됬다
		// => 학생이 새로 추가됬다
		count++; // 학생이 추가되면 1만큼 증가!
		studentId = count; // 학번 = 현재 학생의 수
	}
	
	// count를 반환하는 함수
	public static int getCount() {
		return count;
	}
	
	// count를 변경하는 함수
	public static void setCount(int cnt) {
		count = cnt;
//		studentId = cnt; // 에러남 why ? static 메소드 안에서는 인스턴스변수를 사용할 수 없음
//		studentId는 인스턴스가 생성될때 만들어지기 때문
//		static 메소드안에서 사용할 수 없다
	}
}