package _03_arrayList_vector;

import java.util.ArrayList;
import java.util.List;

public class Login {

	public static void main(String[] args) {
		List<UserData> list = new ArrayList<>();
		
		UserData b1 = new UserData("id1","pw1","이름1","010-1789-1789");
		list.add(b1);
		list.add(new UserData("id1","pw1","이름1","010-1789-1789"));
		list.add(new UserData("id2","pw2","이름2","010-2789-2789"));
		list.add(new UserData("id3","pw3","이름3","010-3789-3789"));
		list.add(new UserData("id4","pw4","이름4","010-4789-4789"));
		
		System.out.println("총 객체 수 : "+list.size());
		UserData UserData = list.get(1);
		System.out.println(UserData.getId());
		System.out.println(UserData.getPw());
		System.out.println(UserData.getName());
		System.out.println(UserData.getPhoneNum());
		System.out.println(list);
		for(UserData b : list) {
			System.out.println(b.getId()+"\t"+b.getPw()+"\t"+b.getName()+"\t"+b.getPhoneNum()+"\t");
		}

	}

}
