package com.javaex.ex01;

public class ListApp {

	public static void main(String[] args) {
		// 복습 : 사각형, 원, 삼각형을 각각의 배열로 관리하기

		// 사각형 관리
		System.out.println("-----사각형-----");

		Ractangle r1 = new Ractangle(2, 5);
		Ractangle r2 = new Ractangle(12, 15);

		// 배열 위치 안 정하고 자동으로 들어가게 하기
		RacList rList = new RacList();
		rList.add(r1);
		rList.add(r2);

		Ractangle r100 = rList.get(0);
		r100.draw();

		// 배열값 개수
		System.out.println(rList.size());

		// 원 관리
		System.out.println("-----원-----");

		CirList cList = new CirList();
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(3);

		cList.add(c1);
		cList.add(c2);

		Circle c100 = cList.get(0);
		Circle c200 = cList.get(1);
		c100.draw();
		c200.draw();
		System.out.println(cList.size());

		// 삼각형 관리
		System.out.println("-----삼각형-----");

		TriList tList = new TriList();
		Triangle t1 = new Triangle(3, 5);
		Triangle t2 = new Triangle(6, 2);
		Triangle t3 = new Triangle(7, 5);

		tList.add(t1);
		tList.add(t2);
		tList.add(t3);

		Triangle t100 = tList.get(0); // 자꾸 메소드 위치가 헷갈리는데 Triangle은 길이 들어있는 클래스고 tList는 배열 만들어서 관리하는 클래스임.
		Triangle t200 = tList.get(1);
		Triangle t300 = tList.get(2);
		t100.draw();
		t200.draw();
		t300.draw();
		System.out.println(tList.size());
	}

}
