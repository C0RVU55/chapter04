package com.javaex.ex08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		// HashMap 사용하기(임포트 필요) : 키-값으로 저장, 키로 데이터(중복 가능)를 구분하기 때문에 키 중복 불가.
		// generic을 Point 하나만 정하는 게 아니라 태그(키)-관리할 데이터(값)을 다 정해야 됨.
		Map<String, Point> pMap = new HashMap<String, Point>();

		Point p1 = new Point(1, 1);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(3, 3);
		Point p4 = new Point(4, 4);

		pMap.put("이다현", p1);
		pMap.put("엘사", p2);
		pMap.put("허영서", p3);
		pMap.put("김마리", p4);

		System.out.println(pMap.toString());
		System.out.println(pMap.get("이다현").getX()); //Map에서 get(key)로 값 불러옴
		System.out.println(pMap.get("엘사").getY());

		Point p5 = new Point(5, 5);
		pMap.put("이다현", p5); // 키값 중복되면 값이 덮어쓰기 됨.

		System.out.println(pMap.toString());

		// Map에서 키를 Set로 관리하고 있음. 그래서 이 안에서 중복체크됨.
		Set<String> keys = pMap.keySet();
		
		for (String key : keys) {
			System.out.println(pMap.get(key).getX()); // 특정 키를 입력해서 그 키의 값을 출력
		}

		System.out.println("개수: " + pMap.size());
	}

}
