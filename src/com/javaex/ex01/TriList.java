package com.javaex.ex01;

public class TriList {

	// 필드
	private Triangle[] rArr;
	private int crtPos;

	// 생성자
	public TriList() { // 일단 배열 올리기만 하는 거라 파라미터 없어도 됨.
		rArr = new Triangle[3];
		crtPos = 0;
	}

	// 메소드 일반
	public void add(Triangle r) {
		rArr[crtPos] = r;
		crtPos++;
	}

	public Triangle get(int i) {
		return rArr[i];
	}

	public int size() {
		return crtPos;
	}
}
