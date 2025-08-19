package _03_arrayList_vector;

public class UserData {

	private String id;
	private String pw;
	private String name;
	private String phoneNum;
	
	public UserData() {}
	public UserData(String id, String pw, String name, String phoneNum) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	// getter/setter메소드
	public String getId() {
	    return id;
	}
	public void setTitle(String id) {
	    this.id = id;
	}
	public String getPw() {
	    return pw;
	}
	public void setPw(String pw) {
	    this.pw = pw;
	}
	public String getName() {
	    return name;
	}
	public void setName(String name) {
	    this.name = name;
	}
	public String getPhoneNum() {
	    return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
	    this.phoneNum = phoneNum;
	}

}
