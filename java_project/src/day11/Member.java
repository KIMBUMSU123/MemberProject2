package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {
	private Long id;
	private String email;
	private String pw;
	private String name;
	private String joinDate;
	
	public Member() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}
	public Member(Long id, String email, String pw, String name) {
		this();
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPw() {
		return pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.printf("%d\t%s\t%s\t%s\t%s\n", id,email,pw,name,joinDate);
	}
}
