package object;

public class Ex1 {

	public static void main(String[] args) {
		// 1. 학생과 버스를 생성
		Student student = new Student("둘리", 10000);
		Bus bus = new Bus(100);

		// 2. 학생이 버스를 탄다
		student.takeBus(bus);

		// 3. 상태 호출
		student.showInfo();
		bus.showInfo();
	}

}

// 지하철
// 아무것도없으면 접근제어자는 default
// 같은 패키지 내에서 사용 가능
class Subway {
	String lineNumber; // 노선번호
	int passengerCount; // 승객의 수
	int money; // 수입

	// 노선번호를 초기화하는 생성자
	public Subway(String lineNumber) {
		super();
		this.lineNumber = lineNumber;
	}

	// 지하철 승객을 태우는 메소드
	// 승객을 태운다면? 수입과 승객의수가 늘어남
	// 매개변수: 지하철요금
	public void take(int money) {
		this.money = this.money + money;
		passengerCount++;
	}

	// 지하철의 모든 정보를 출력하는 메소드
	public void showInfo() {
		System.out.println("지하철" + lineNumber + "의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원입니다");
	}
}

// 버스
class Bus {
	int busNumber; // 버스번호
	int passengerCount; // 승객수
	int money; // 수입

	// 버스번호 초기화하는 생성자
	public Bus(int busNumber) {
		super();
		this.busNumber = busNumber;
	}

	// 버스에 승객을 태우는 메소드
	// 수입과 승객의 수 증가
	// 매개변수: 버스요금
	public void take(int money) {
		this.money = this.money + money;
		this.passengerCount++;
	}

	// 버스의 모든 정보 출력
	public void showInfo() {
		System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원입니다");
	}
}

// 택시
class Taxi {
	String taxiNumber;
	int money;
	public Taxi(String taxiNumber) {
		super();
		this.taxiNumber = taxiNumber;
	}
	
	public void take(int money) {
		this.money = this.money + money;
	}
	
	// 택시 정보 출력
	public void showInfo() {		
		System.out.println(taxiNumber+ "택시의 수입은 "+money+"원입니다");		
	}
}
// 학생
class Student {
	String studentName; // 학생의 이름
	int money; // 학생의 소지금

	// 이름과 소지금을 모두 초기화하는 생성자
	public Student(String studentName, int money) {
		super();
		this.studentName = studentName;
		this.money = money;
	}

	// 학생이 버스에 타는 메소드
	// 학생은 버스에 요금을 지불해야함
	// 매개변수: 버스*
	public void takeBus(Bus bus) {
		bus.take(1000); // 버스에 요금을 냄
		this.money = this.money - 1000; // 소지금이 줄어듬
	}

	// 학생이 지하철에 타는 메소드
	// 지하철에 요금을 내고 소지금은 줄어듬
	// 매개변수: 지하철
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money = this.money - 1500;
	}
	
	// 학생이 택시를 타는 메소드
	public void takeTaxi(Taxi taxi) {
		// 소지금이 만원보다 적으면 택시에 탈수 없음
		if(money < 10000) {
			System.out.println("소지금이 만원보다 적으면 택시에 탈수 없습니다");
			return; // 함수 종료
		}		
		taxi.take(10000); // 택시요금 10000원
		this.money = this.money - 10000; // 가진돈에서 10000원 빼기
		
	}

	// 학생의 정보 출력 메소드
	public void showInfo() {
		
		System.out.println(studentName + "님의 남은 돈은 " + money + "원입니다");
		
	}
}
	
	
	
