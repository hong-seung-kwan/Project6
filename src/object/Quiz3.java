package object;

// <카페 클래스>
// 속성: 카페이름, 수입
// 기능: 손님에게 커피를 파는 기능
// <손님 클래스>
// 속성: 이름, 소지금
// 기능: 카페에서 아메리카노를 사는 기능, 라떼를 사는 기능
// 10000원을 가진 둘리는 별다방 카페에서 아메리카노(4000원)를 샀습니다
// 20000원을 가진 또치는 별다방 카페에서 라떼(5000원)을 샀습니다
// 단, 소지금이 커피가격보다 적으면 살 수 없습니다!
public class Quiz3 {

	public static void main(String[] args) {
		
		Customer customer = new Customer("둘리", 10000);
		Customer customer2 = new Customer("또치", 20000);
		Cafe cafe = new Cafe("별다방");
		
		customer.buyAmericano(cafe);
		customer2.buyLatte(cafe);
		
		customer.showInfo();
		customer2.showInfo();
		cafe.showInfo();
	}

}

class Cafe{
	String cafeName;
	int money;
	
	public Cafe(String cafeName) {
		super();
		this.cafeName = cafeName;
	}
	
	// 수입
	public void sell(int money) {
		this.money = this.money + money;
	}
	
	// 정보 출력
	public void showInfo() {
		System.out.println(cafeName+ "의 수입은 "+money+"원입니다");
	}
}
class Customer {
	String name;
	int money;
	
	public Customer(String name, int money) {
		super();
		this.name = name;
		this.money = money;
	}
	// 카페에서 아메리카노를 사는 기능
	public void buyAmericano(Cafe cafe) {
		
		if(money < 4000) {
			System.out.println("소지금이 커피가격보다 적으면 살수 없습니다");
			return;
		}
		cafe.sell(4000);
		this.money = this.money - 4000;
	}
	// 카페에서 라떼를 사는 기능
	public void buyLatte(Cafe cafe) {
		if(money < 5000) {
			System.out.println("소지금이 커피가격보다 적으면 살수 없습니다");
			return;
		}
		cafe.sell(5000);
		this.money = this.money - 5000;
	}
	// 정보 출력
	public void showInfo() {
		System.out.println(name+"님의 남은 돈은 " + money + "원입니다");
	}
}