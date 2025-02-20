package object;

public class Quiz1 {

	// 학생이 대중교통을 타고 학교에 가는 상황 구현
	// 초기상태 : 둘리 ,5000 도우너, 10000
	// 둘리는 8번 버스를 타고 학교에 갑니다
	// 도우너는 2호선 지하철을 타고 학교에 갑니다
	public static void main(String[] args) {
		
		// 1. 학생과 대중교통 생성
		Student student1 = new Student("둘리", 5000);
		Student student2 = new Student("도우너", 10000);
		Bus bus = new Bus(8);
		Subway subway = new Subway("2호선");
		
		// 2. 학생 대중교통 이용
		student1.takeBus(bus);
		student2.takeSubway(subway);
		
		// 3. 상태 확인
		student1.showInfo();
		student2.showInfo();
		bus.showInfo();
		subway.showInfo();
	}

}
