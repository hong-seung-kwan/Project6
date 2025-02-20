package staticex;

//언제 static을 쓸까?
//계산기의 파이 / 학생의 이름
//같은 값을 사용할때: static변수
//고유한 값을 가질때: 인스턴스변수
public class Ex2 {

	public static void main(String[] args) {
		
		// 원의 둘레 구하기
		// 클래스.static변수
		System.out.println(10*10*Calculator.pi);
		
		// 클래스.static메소드
		System.out.println(Calculator.plus(2, 3));		
		System.out.println(Calculator.minus(5, 1));

	}

}

// 계산기
class Calculator {
	
	static double pi = 3.14; // 파이
	
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}
}






