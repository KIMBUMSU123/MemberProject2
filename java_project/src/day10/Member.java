package day10;

public class Member {
	// 필드
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	// 생성자
	public Member() {
		
	}
	public Member(String email, String pw, String name, String joinDate) {
		this.email = email;
		this.pw = pw;
		this.name = name;
		this.joinDate = joinDate;
	}
	
	// 메서드 get/set
	public String getEmail(){
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(String joinDate) {		
		this.joinDate = joinDate;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\n", email,pw,name,joinDate);
	}
	
	
}








