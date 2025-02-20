package object;

public class Quiz2 {
	// 택시 클래스 정의
	// 속성: 택시번호, 수입
	// 기능: 생성자, 승객을 태우는 기능, 모든정보 출력 기능
	
	// 학생이 택시에 타는 과정 구현
	// 2만원을 가진 둘리는 택시를 타고, 택시요금을 1만원 지불했습니다
	// 단, 소지금이 만원보다 적으면 택시에 탈수 없습니다!
	public static void main(String[] args) {
		Student student = new Student("둘리", 5000);
		Taxi taxi = new Taxi("111나 1111");
		
		student.takeTaxi(taxi);
		
		student.showInfo();
		taxi.showInfo();
		
	}

}

