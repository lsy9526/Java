package com.kh.a_encapsulation;

public class Run {

	public static void main(String[] args) {
		
		//강사 계좌 
		Account lecturAccount = new Account();
		//이름 
		//setter메서드를 활용해서 name속성에 값을 대입 
		lecturAccount.setName("하명도");
		//잔액 
		lecturAccount.setBalance(1000);
		//50000원 입금 
		lecturAccount.deposit(50000);
		//잔고 확인 
		//getter메서드를 활용해서 이름과 잔액을 확인 
		System.out.println(lecturAccount.getName() + "의 잔액 : " + lecturAccount.getBalance()); 
		System.out.println("강사 계좌 주소 값 : " + System.identityHashCode(lecturAccount));
		
		
		System.out.println("\n===============================================================\n");
		
		
		//학생 계좌 
		Account myAccount = new Account();
		myAccount.setName("이승연");
		myAccount.setBalance(100000000);
		myAccount.withdraw(50000);
		System.out.println(myAccount.getName() + "의 잔액 : " + myAccount.getBalance() + "원 입니다");
		
		
		
		///////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n===============================================================\n");
		
		//참치회를 먹었다는 이야기를 듣고 국밥 드립을 치는 k씨 
		KookBabDreeper k = new KookBabDreeper();
		k.setFoodName("참치회");
		k.setFoodPrice(50000);
		k.dreep();
		
		//떡볶이를 먹었다는 이야기를 듣고 국밥 드립을 치는 l씨 
		KookBabDreeper l = new KookBabDreeper();
		l.setFoodName("떡볶이");
		l.setFoodPrice(4500);
		l.dreep();
		
		///////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("\n===============================================================\n");
		
		Score studentScore = new Score();
		System.out.println();
		//setter메서드를 활용한 초기화 
		//장점 : 가독성이 좋다 
		//단점 : 객체가 생성되고 나서 속성값이 초기화되기 때문에 누락될 여지가 있다 
		//		객체불변성이 유지되지 않는다
		//		->디자인 패턴 으로 극복 (?) 
		studentScore.setName("이승연");
		studentScore.setKor(100);
		studentScore.setMath(100);
		studentScore.setEng(100);
		System.out.println("이름 : " + studentScore.getName());
		System.out.println("점수 총합 : " + studentScore.calSum());
		System.out.println("점수 평균 : " + studentScore.calAvg());
		System.out.println("등급 : " + studentScore.calGrade());
		System.out.println("정보 : " + studentScore);
		//표준 출력문의 전달인자로 레퍼런스를 넘기면, 해당 레퍼런스의 toString()을 자동으로 호출 
		//System.out.println("정보 : " + studentScore.toString()); 위와 같음 
		
	
		System.out.println("\n===============================================================\n");
		
		//매개변수가 있는 생성자로 클래스 인스턴스화 
		//장점 : 코드가 짧음 
		//단점 : 코드만 보고 매개변수로 넘어가는 전달인ㄴ자가 어떤 속성에 대입되는지 알 수 없음 
		//		->가독성이 떨어짐 
		Score teacherScore = new Score("하명도" , 90, 90, 90);
		System.out.println("이름 : " + teacherScore.getName());
		System.out.println("점수 총합 : " + teacherScore.calSum());
		System.out.println("점수 평균 : " + teacherScore.calAvg());
		System.out.println("등급 : " + teacherScore.calGrade());
		System.out.println("정보 : " + teacherScore);
		
		
	}

}
