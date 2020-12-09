package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// Point를 Set으로 관리하기

		System.out.println("-----중복 Point 추가테스트-----");
		Set<Point> pSet = new HashSet<Point>();

		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(1, 1); // 이렇게 넣어도 p1과 중복으로 처리하지 않음. Point에서 equals()를 재정의해야 됨.

		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);

		System.out.println(pSet.toString());

		// hashCode() equals() 이용 중복체크 --> equals()뿐만 아니라 HashCode()도 같이 따져야 됨. 
		Set<Point2> pSet2 = new HashSet<Point2>();

		Point2 p11 = new Point2(1, 1);
		Point2 p12 = new Point2(2, 2);
		Point2 p13 = new Point2(3, 3);
		Point2 p14 = new Point2(1, 1);

		pSet2.add(p11);
		pSet2.add(p12);
		pSet2.add(p13);
		pSet2.add(p14);

		System.out.println(p11.equals(p14));

		// hashCode() equals() 이용 중복체크 --> y값이 같으면 같다 정의하기
		Set<Point3> pSet3 = new HashSet<Point3>();

		Point3 p111 = new Point3(1, 1);
		Point3 p122 = new Point3(2, 2);
		Point3 p133 = new Point3(3, 3);
		Point3 p144 = new Point3(5, 1);

		pSet3.add(p111);
		pSet3.add(p122);
		pSet3.add(p133);
		pSet3.add(p144);
		
		//재정의하지 않아도 오류 안 남. 부모꺼 끌어다 써서.
		System.out.println(pSet3.toString());
		System.out.println(p111.equals(p144));

	}

}
