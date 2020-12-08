package com.javaex.ex03;

public class ListApp3 {

	public static void main(String[] args) {
		// Generic
		// 범용 ObjList 사용하되 메모리에 올릴 때(new)는 특정 도형만 넣을 수 있게 제한함. 안 그러면 원리스트에 사각형 들어가도 Object라서 오류가 안 남.
		// --> 클래스명1<클래스명2> 사용

		// 사각형
		MyList<Ractangle> rList = new MyList<Ractangle>();

		Ractangle r1 = new Ractangle(5, 5);
		Ractangle r2 = new Ractangle(3, 3);

		rList.add(r1);
		rList.add(r2);

		for (int i = 0; i < rList.size(); i++) {
			rList.get(i).draw(); // 원래 MyList가 Object라 (Ractangle)이렇게 형변환했는데 <>써서 그냥 Ractangle 클래스라고 생각하면 됨.
		}

		// 원
		MyList<Circle> cList = new MyList<Circle>();

		Circle c1 = new Circle(5);
		Circle c2 = new Circle(3);

		cList.add(c1);
		cList.add(c2);

		// 삼각형
		MyList<Triangle> tList = new MyList<Triangle>();

		Triangle t1 = new Triangle(3, 4);
		Triangle t2 = new Triangle(7, 7);

		tList.add(t1);
		tList.add(t2);

	}

}
