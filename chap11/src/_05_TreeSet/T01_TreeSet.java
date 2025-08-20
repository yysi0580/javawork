package _05_TreeSet;

import java.util.*;

public class T01_TreeSet {

	public static void main(String[] args) {
		TreeSet<Integer> score = new TreeSet<>();
		score.add(84);
		score.add(94);
		score.add(95);
		score.add(88);
		score.add(90);
		
		System.out.println("가장 낮은 점수 : " + score.first());
		System.out.println("가장 높은 점수 : " + score.last());
		System.out.println("95점 보다 아래 점수 : " + score.lower(95));
		System.out.println("95점 보다 높은 점수 : " + score.higher(95));
		System.out.println("95점이거나 바로 아래 점수 : " + score.floor(95));
		System.out.println("95점이거나 바로 아래 점수 : " + score.ceiling(95));
		
		Set<Integer> lotto=new TreeSet<Integer>();
		while(lotto.size() < 6){
			lotto.add((int)(Math.random() * 45) + 1);
			
		}
		System.out.println(lotto);
		
		
		
	}

}
