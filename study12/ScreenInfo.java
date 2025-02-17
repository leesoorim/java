package study12;

import java.util.Scanner;

public class ScreenInfo {
	
	String movieTitle="";
	int ticketPrice=10000;
	/*
	 * 생성자, 다형성(오버로딩)
	 */
	
	ScreenInfo(String movieTitle){ // 매개변수
		this.movieTitle=movieTitle;
	}
	ScreenInfo(String movieTitle,int ticketPrice){ // 매개변수
		this.movieTitle=movieTitle;
		this.ticketPrice=ticketPrice;
	}

	public static void main(String[] args) {

		ScreenInfo info1=new ScreenInfo("미이라");
		ScreenInfo info2=new ScreenInfo("아마존",15000);
		
		System.out.println("screen 1의 영화제목은"+info1.movieTitle);
		System.out.println("screen 2의 영화제목은"+info2.movieTitle);
		System.out.println("screen 1의 가격은"+info1.ticketPrice);
		System.out.println("screen 2의 가격은"+info2.ticketPrice);
		
		Scanner scn = new Scanner(System.in); // 클래스
		
	}

}
