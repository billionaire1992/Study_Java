import java.util.ArrayList;
import java.util.Arrays;

import com.hanul.array.Test;

public class ArrayListMain01 {
	public static void main(String[] args) {
		//3개의 크기(길이) 를 갖는 정수형 배열 (arr[])을 선언 및 생성하시오 
		int[] arr = new int[3];
		
		//배열(arr[])에 10, 20, 30 을 할당하시오.
		//arr[0] = 10;
		//arr[1] = 20;
		//arr[2] = 30;
		
		for (int i = 0; i < arr.length; i++) { 
			arr[i] = (i + 1) * 10;
		}//for
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i + "]의 값 : "+arr[i]);
		}//for
		
		//배열(arr[])의 내용을 출력하시오.
		System.out.println("arr[]의 값 : "+Arrays.toString(arr));
		
		
		System.out.println("=========================");
		
		//Test.java 타입 5개를 저장할 수 있는 배열(test[])을 선언 및 생성 : com.hanul.array package
		Test[] test = new Test[5];
		
		for (int i = 0; i < test.length; i++) {
			test[i] = new Test();
		}
		
		for (int i = 0; i < test.length; i++) {
			test[i].display();
		}//for
		System.out.println("=========================");
		
		//Test.java 타입을 갖는 크기(길이)에 제한이 없는 컬렉션 배열(무한배열) 생성 ▶ ArrayList<>
		ArrayList<Test> list = new ArrayList<Test>();
		list.add(new Test());		//add(): 삽입
		list.add(new Test());
		list.add(new Test());
		list.add(new Test());
		list.add(new Test());
		list.add(new Test());
		list.add(new Test());
			
		for (int i = 0; i < list.size(); i++) {		//size() : ArrayList<> 크기 (길이) 
			list.get(i).display(); 					//get()  : 출력(가져온다)
			
		}
		
		
	}//main()
}//class


/*
○ Array [] : 배열 
	- 순차적(index)으로 어떤 자료를 저장한다
	- 자료의 타입이 동일해야 한다.
	- 배열의 크기(길이)를 먼저 선언 및 생성해야한다.
	- 배열의 생성 단계에서 객체화 되어야 한다 ▶ new → 참조형 자료구조 
	- 주요한 키워드 : length → 크기 (길이) ▶ 단순 for문
	
	
○ ArrayList <> : 컬렉션 자료구조( 가변길이 배열,  무한배열) 
	- 순차적(index)으로 어떤 자료를 저장한다
	- &&&자료의 타입이 달라도 된다 (단, 클래스 타입만 저장)
	- &&&배열의 크기(길이)를 선언하지 않는다.
	- 배열의 생성 단계에서 객체화 되어야 한다 ▶ new → 참조형 자료구조 
	- 주요한 메소드 : size() → 길이, add() → 삽입, get() → 출력, set() → 수정, remove() → 삭제 ▶향상된 for문
*/