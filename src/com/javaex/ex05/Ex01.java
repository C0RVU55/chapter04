package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		// Set --> HashSet (둘 다 import 필요)
		// ctrl+shift+o : organize import

		//generic에는 기본자료형 바로 못써서 wrapper로 써야됨.
		Set<Integer> iSet = new HashSet<Integer>();
		
		/*
		Integer i01=new Integer(3);
		Integer i02=new Integer(5);
		Integer i03=3; //위처럼 말고 이렇게 써도 됨. 자동으로 박싱됨.
		*/
		
		//추가 add()
		iSet.add(3); //그냥 이렇게 넣어도 알아서 integer로 박싱해서 넣어줌.
		iSet.add(5);
		iSet.add(8);
		
		//toString()
		System.out.println(iSet.toString());
		
		//size()
		System.out.println("size: "+iSet.size());
		
		//출력 : Set은 순서가 없어서 방번호 개념으로 for문 돌리는 게 아님. --> 다른 for문(향상된 for문) 이용.
		for(Integer i : iSet) { //iSet 안의 숫자를 하나씩 꺼내서 i에 넣음
			System.out.println(i.toString());
		}
		for(int i : iSet) { //이러면 언박싱돼서 i에 바로 값이 들어가서 toString 사용불가
			System.out.println("언박싱: "+i);
		}
		
		//삭제 : remove
		System.out.println("---삭제---");
		
		iSet.remove(3); //n번째가 아니라 그냥 데이터값 3 지우라는 뜻
		for(Integer i : iSet) { 
			System.out.println(i.toString());
		}
		
		//중복값 추가 --> 오류 안 나고 그냥 안 들어감.
		iSet.add(5);
		for(Integer i : iSet) { 
			System.out.println(i.toString());
		}

	}

}
