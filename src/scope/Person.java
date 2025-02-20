package scope;

// 변수의 유효범위를 작성하세요 static/인스턴스
public class Person {
	String name; // 객체를 생성한 후에 사용 가능 , 패키지내에서 사용 가능
	int age; // 객체를 생성한 후에 사용 가능, 패키지내에서 사용 가능
	static char gender; // 프로그램 시작 후 바로 사용 가능, 함수내에서만 사용 가능
	// static : 1. 바로 생성 2. 1번만 생성 
}
