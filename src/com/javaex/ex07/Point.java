package com.javaex.ex07;

public class Point {

	// 필드
	private int x;
	private int y;

	// 생성자
	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// 메소드 겟셋
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// 메소드 일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	// override/implement method --> 부모쪽 equals() 가져옴.
	// 그런데 이렇게 재정의해도 같은 값으로 안 봄. --> 로직자체가 해시코드 먼저 비교해서 같으면 equals 등 세부적으로 같은지 체크하는 순.
	// 효율면을 다 고려한 로직으로 해시코드로 체크해서 이름도 HashSet임.
	@Override
	public boolean equals(Object obj) {
		Point p = (Point) obj;
		if (this.x == p.x && this.y == p.y) { 
			return true;
		} else {
			return false;
		}
	}

}
