package com.javaex.ex01;

public class ObjList {

	//필드 : 범용으로 쓰기 위해 자료형을 Rectangle에서 Object로 바꿈.
	private Object[] rArr;
	private int crtPos; //현재위치
	
	//생성자
	public ObjList() {
		rArr=new Object[3]; //어쨌든 배열이라 총 몇 개인지는 정해져 있어야 됨.
		crtPos=0;
	}
	
	//메소드 일반
	public void add(Object r) { //배열 비어있는 자리에 값을 넣음
		rArr[crtPos] = r;
		crtPos++;
	}
	public Object get(int index) {
		return rArr[index];
	}
	public int size() { //배열 몇개인지
		return crtPos;
	}
}
