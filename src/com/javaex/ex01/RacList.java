package com.javaex.ex01;

public class RacList {

	//필드
	private Ractangle[] rArr;
	private int crtPos; //현재위치
	
	//생성자
	public RacList() {
		rArr=new Ractangle[3]; //어쨌든 배열이라 총 몇 개인지는 정해져 있어야 됨.
		crtPos=0;
	}
	
	//메소드 일반
	public void add(Ractangle r) { //배열 비어있는 자리에 값을 넣음
		rArr[crtPos] = r;
		crtPos++;
	}
	public Ractangle get(int index) {
		return rArr[index];
	}
	public int size() { //배열 몇개인지
		return crtPos;
	}
}
