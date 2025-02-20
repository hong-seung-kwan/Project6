package scope;

// 접근제어자에 따라 변수의 사용가능한 범위를 작성하세요
// 접근제어자, static/인스턴스, 전역/지역

class A {
	public int var1; // 외부패키지o 내부패키지o 어디서나 사용가능 
	int var2; // 내부패키지에서만 사용가능 
	private int var3; // 선언한(A) 클래스 내에서만 사용 가능
}
