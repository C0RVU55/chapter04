package com.javaex.ex03;

public class MyList<T> { // 대문자로 변수 암거나 넣음. ListApp3에서 Rectangle(다른 클래스명)을 넣을 거니까 이게 들어갈 자리를 수정해줘야 됨.

	// Generic

	// 필드 : 범용으로 쓰기 위해 자료형을 Rectangle에서 Object로 바꿈.
	// --> 원하는 클래스만 들어가도록 제한하기 위해 Object였던 걸 <>안의 변수로 바꿈.
	private T[] rArr;
	private int crtPos;

	// 생성자
	public MyList() {
		rArr = (T[]) (new Object[3]); // 일단 외우기 : <>안에 지정한 클래스로 바뀌어서 올라간다는 뜻.
		crtPos = 0;
	}
	// 그냥 new T[]하면 오류나는데 T는 아직 안 정해진 자료형이라 먼저 Object로 배열 받은 다음에 T로 형변환시키는 거.

	// 메소드 일반
	public void add(T r) {
		rArr[crtPos] = r;
		crtPos++;
	}

	public T get(int index) {
		return rArr[index];
	}

	public int size() {
		return crtPos;
	}
}
