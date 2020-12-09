package com.javaex.ex04;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListApp {

	public static void main(String[] args) {
		// MyList가 이거 예습한 거
		// ArrayList() 또는 ArrayList<자료형 특정클래스명>() : (임포트해야 됨) 추가 및 삭제가 번거롭지만 위치가 정해져 있어서 검색이 빠름.

		// 상황이 변해서 검색속도는 느리지만 추가삭제가 쉬운 LinkedList로 바꿔야 된다면 --> 걍 아래처럼 바꾸고 같은 메소드 쓰면 됨.
		// 로직만 다르고 메소드명은 같기 때문.
		
		// ArrayList<Rectangle> rList = new ArrayList<Rectangle>();
		LinkedList<Rectangle> rList = new LinkedList<Rectangle>();

		Rectangle r1 = new Rectangle(3, 3);
		Rectangle r2 = new Rectangle(5, 5);

		// add()
		rList.add(r1);
		rList.add(r2);

		// get()
		Rectangle r = rList.get(0);
		System.out.println(r.getWidth()); // 리스트에 들어간 상태에서 Rectangle의 메소드 호출
		System.out.println(r.getHeight());
		r.draw();
		System.out.println(r.toString());

		// 전체출력 get() size() 이용
		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw(); //rList에서 Rectangle의 주소값을 return받아서 Rectangle의 메소드인 draw()를 호출함.
		}
		
		//이거는 ArrayList에 있는 toString가 작동하긴 해서 모든 배열값이 나오긴 하는데 Rectangle에서 재정의한 toString을 참고해서 출력됨.
		System.out.println("------toString");
		System.out.println(rList.toString()); 

		// 배열 위치 정해서 넣기
		System.out.println("-------");

		Rectangle r3 = new Rectangle(100, 100);
		// rList.add(r3); add로 넣으면 기본적으로 맨 끝에 들어감. 중간에 넣고 싶으면 오버로딩된 메소드 쓰면 됨.
		// add() 순서대로 넣기 / add(위치int, 넣을값)
		rList.add(1, r3);

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		// 삭제 remove(위치int 또는 해당 변수)
		System.out.println("-------");

		rList.remove(1);
		rList.remove(r1);

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw();
		}

		////////////////// 원
		System.out.println("-------");

		// ArrayList<Circle> cList = new ArrayList<Circle>();
		LinkedList<Circle> cList = new LinkedList<Circle>();

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(9);

		cList.add(c1);
		cList.add(c2);
		// cList.add(r1); <-- 오류남. ArrayList가 범용이긴 하지만 정해둔 클래스만 들어가도록 제한해둔다는 점이 중요

		for (int i = 0; i < cList.size(); i++) {
			cList.get(i).draw();
		}
		
		cList.toString();

	}

}
