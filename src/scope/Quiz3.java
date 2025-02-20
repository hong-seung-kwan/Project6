package scope;

public class Quiz3 {
	// 모든 변수의 유효범위를 작성하세요 (블록스코프)
	public static void main(String[] args) {

		Person person = new Person(); // 메인 함수
		int i = 10; // 메인함수
		if (i > 1) { // 조건문(if문)
			String str = "안녕하세요";
			System.out.println(str);
		}
		for (int k = 0; k < 3; k++) { // 반복문(for문)
			System.out.println("~");
		}
	}
}
