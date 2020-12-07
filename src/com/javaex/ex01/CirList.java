package com.javaex.ex01;

public class CirList {

	// 필드
	private Circle[] rArr;
	private int crtPos;

	// 생성자 : 배열 만들 거니까 생성자에서 만듦.
	public CirList() {
		rArr = new Circle[3];
		crtPos = 0; //필드에서 0으로 정해놔도 정상작동하긴 하는데 어쨌든 생성자에서 0을 갖고 있어야 됨.
	}

	// 메소드 일반
	public void add(Circle r) {
		rArr[crtPos] = r;
		crtPos++;
	}

	public Circle get(int i) {
		return rArr[i];
	}

	public int size() {
		return crtPos;
	}
}
