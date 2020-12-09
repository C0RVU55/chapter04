package com.javaex.ex06;

import java.util.HashSet;
import java.util.Set;

public class MiniLottoApp {

	public static void main(String[] args) {
		// 미니로또 생성기(중복체크 포함) --> Set은 중복값이 안 들어가서 중복돼면 1번 더 돌려야 됨.

		// int num = (int) (Math.random() * 45) + 1;

		Set<Integer> lSet = new HashSet<Integer>();

		/*
		 * lSet.add(num); 
		 * lSet.add(num); 
		 * lSet.add(num); 
		 * lSet.add(num); 
		 * lSet.add(num);
		 * lSet.add(num);
		 */
		
		while (lSet.size()<6) { //for문 2번 어쩌구할 게 아니라 6보다 작으면 계속 반복되게 작성함.
			int num = (int) (Math.random() * 45) + 1;
			lSet.add(num);
		}

		for (int i : lSet) {
			System.out.print(i+"   ");
		}

	}

}
