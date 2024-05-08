package com.hanul.poly03;

public class TV implements RemoCon{
	//Interface 의 상속은 implements 키워드 사용
	@Override
	public void VolUp() {
		System.out.println("Tv 소리를 올린다");
	}

	@Override
	public void VolDown() {
		System.out.println("Tv 소리를 내린다");
	}

	@Override
	public void internet() {
		System.out.println("인터넷에 접속한다");
	}				
}//class
