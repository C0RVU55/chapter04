package com.javaex.ex07;

public class Point3 {
	// 필드
	private int x;
	private int y;

	// 생성자
	public Point3() {
	}

	public Point3(int x, int y) {
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

	// 중복체크 HashCode()랑 equals() 같이 봐야 됨.
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + x; y값만 비교하려면 y값만 남기면 됨.
		result = prime * result + y; 
		System.out.println(x+","+y+"  "+result); //확인용
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3 other = (Point3) obj;
		/*
		if (x != other.x) //y값만 같으면 되니까 x값 비교문은 삭제
			return false;
		*/
		if (y != other.y)
			return false;
		return true;
	}

}
