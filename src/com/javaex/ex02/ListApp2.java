package com.javaex.ex02;

public class ListApp2 {

	public static void main(String[] args) {
		// 각각 리스트 사용 안하고 ObjList 3번 사용
		// 새 도형이 추가돼도 쉽게 추가 가능

		Ractangle r1 = new Ractangle(3, 3);
		Ractangle r2 = new Ractangle(5, 5);

		ObjList rList = new ObjList();
		rList.add(r1);
		rList.add(r2);

		for (int i = 0; i < rList.size(); i++) {
			((Ractangle) (rList.get(i))).draw();
		}

		// 원
		Circle c1 = new Circle(5);
		Circle c2 = new Circle(10);

		ObjList cList = new ObjList(); // 틀은 범용이지만 메모리에 올릴 땐 특정 도형만 들어가게 제한하고 싶음 --> ListApp3
		cList.add(c1);
		cList.add(c2); // 단점 : 여기에 r1넣어도 Object라서 다 들어감.

		for (int i = 0; i < cList.size(); i++) {
			((Circle) (cList.get(i))).draw();
		}

		// 삼각형
		Triangle t1 = new Triangle(3, 2);
		Triangle t2 = new Triangle(7, 7);

		ObjList tList = new ObjList();
		tList.add(t1);
		tList.add(t2);

	}

}
