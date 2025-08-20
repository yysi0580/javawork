package _03_HashSet;

import java.util.HashSet;
import java.util.Set;

class Member {
	String name;
	int age;
	Member(String name, int age){
		this.age = age;
		this.name = name;
		
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Member member = (Member) obj;
	    return age == member.age && (name != null ? name.equals(member.name) : member.name == null);
	}

	@Override
	public int hashCode() {
	    int result = (name != null) ? name.hashCode() : 0;
	    result = 31 * result + age;
	    return result;
	}
	@Override
    public String toString() {
        return "name='" + name + "', age=" + age ;
    }
//	Object equals => 주소가 같은가?
// 			hashCode => 값이 같으면 같은 해시코드가 나오게 오버라이딩
//			참조변수를 출력하면 이름/나이
}

public class T03_HashSet {

	public static void main(String[] args) {
		HashSet<Member> set =new HashSet<>();
		
		set.add(new Member("홍길동", 20));
		set.add(new Member("더조은", 20));
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 30));
		set.add(new Member("더조은", 25));
		set.add(new Member("홍길동", 25));
		set.add(new Member("한빛나", 25));
		
		
		System.out.println("총 객체 수 : " + set.size());
		System.out.println(set.toString());
		
		
	}

}
