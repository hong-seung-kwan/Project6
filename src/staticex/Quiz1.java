package staticex;

public class Quiz1 {

	public static void main(String[] args) {
		Card card = new Card();
		Card card2 = new Card();
		Card card3 = new Card();
		
		card.showInfo();
		card2.showInfo();
		card3.showInfo();
	}

}

class Card{
	static int serialNum = 100; // 초기값
	int cardNo; // 카드번호
	
	// 생성자가 호출된다는 것은 카드가 추가 된다는 것
	// 카드의 수 증가
	public Card() { 
		serialNum++; // 시리얼번호 증가
		this.cardNo = serialNum; //카드번호 = 시리얼번호
	}
	public void showInfo() {
		System.out.println("카드번호: " + cardNo);
	}
	
}




//class Card {
//	static int cardNumber = 100;
//	int count;
//	
//	public Card() {
//		cardNumber++;
//		count = cardNumber ;		
//	}
//	public void showInfo() {
//		System.out.println("카드 번호: " + count);
//	}
//}