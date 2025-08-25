package _06_Comparable;

import java.util.*;

class Classes1 implements Comparable<Classes1> {
    String couresTitle;
    int prise;

    public Classes1(String couresTitle, int prise) {
        this.couresTitle = couresTitle;
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Classes1 [couresTitle=" + couresTitle + ", prise=" + prise + "]";
    }

    @Override
    public int compareTo(Classes1 o) {
        // 오름차순 가격 비교
        return Integer.compare(this.prise, o.prise);
    }
}

public class T04_CompareTo {
    public static void main(String[] args) {
        // 오름차순 TreeSet
        TreeSet<Classes1> p1 = new TreeSet<>();
        p1.add(new Classes1("온라인 프로그래밍 기초 강좌", 40));
        p1.add(new Classes1("중급 개발 실무 강좌", 20));
        p1.add(new Classes1("고급 전문 자격증 준비 강좌", 65));

        System.out.println("오름차순 정렬:");
        for (Classes1 c : p1) {
            System.out.println(c);
        }

        // 내림차순 TreeSet (Comparator 전달)
        TreeSet<Classes1> p2 = new TreeSet<>(Collections.reverseOrder());
        p2.addAll(p1);

        System.out.println("\n내림차순 정렬:");
        for (Classes1 c : p2) {
            System.out.println(c);
        }
    }
}
