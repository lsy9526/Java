package com.kh.a_encapsulation.method_encapsulation;

public class AutumnConcert {
	
	public void startconcert() {
		
		System.out.println("가을 콘서트 시작합니다!!!!");
		System.out.println("연주자가 무대로 올라옵니다");
		
		//연주자 클래스를 인서트너스화 해서 연주를 위한 메서드를 호출 
		//연주 시작 -> 연주 진행 -> 연주 끝 
		player player = new player();
		player.startPlay();
		
		
		//player.start();
		//player.playing();
		//player.end();
		
		System.out.println("가을 콘서트 끝났습니다");
		
		
	}

}
