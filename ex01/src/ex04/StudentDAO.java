package ex04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	Connection con = Database.connect();
	//학생수정
	public void update(Student vo) {
		try {
			String sql="update tbl_juso set name=?,juso=?,phone=? where no=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(4, vo.getNo());
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getJuso());
			ps.setString(3, vo.getPhone());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생수정:"+e.toString());
		}
	}

	//학생삭제
	public void delete(int number) {
	try {
		String sql="delete from tbl_juso where no=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, number);
		ps.execute();
	}catch(Exception e) {
		System.out.println("학생삭제:"+e.toString());
	}
	}
	// 학생조회
	public Student read(int no) {
		Student vo=new Student();
		try {
		String sql = "select * from tbl_juso where no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			vo.setNo(rs.getInt("no"));
			vo.setName(rs.getString("name"));
			vo.setJuso(rs.getString("juso"));
			vo.setPhone(rs.getString("phone"));
		}
		}catch(Exception e) {
			System.out.println("학생등록:"+e.toString());
		}
		return vo;
	}
	// 학생등록
	public void insert(Student vo) {
		try {
			String sql="insert into tbl_juso(no, name,juso,phone) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, vo.getNo());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getJuso());
			ps.setString(4, vo.getPhone());
			ps.execute();
		}catch(Exception e) {
			System.out.println("학생등록:"+e.toString());
		}
	}
	
	// 학생목록
	public List<Student> list() {
		List<Student> array = new ArrayList<>();
		try {
			String sql = "select * from tbl_juso order by name";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Student vo=new Student();
				vo.setNo(rs.getInt("no"));
				vo.setName(rs.getString("name"));
				vo.setJuso(rs.getString("juso"));
				vo.setPhone(rs.getString("phone"));
				array.add(vo);
			}
		} catch (Exception e) {
			System.out.println("학생목록: " + e.toString());
		}
		return array;
	}
}