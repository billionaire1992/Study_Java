package com.hanul.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO { // 실제적으로 DB와 연동하여 요구사항 (트랜젝션)을 처리한 후 결과를 리턴
	private Connection conn; // 연결객체
	private PreparedStatement ps; // 전송객체
	private ResultSet rs; // 결과객체(Select)

	// DB 접속 메소드
	public Connection getConn() {
		try {
			String user = "hanul";
			String password = "0000";
			String url = "jdbc:oracle:thin:@121.147.245.32:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getConn() Exception ! ! ! ");
		} // try
		return conn;
	}// getConn()

	// DB접속 종료 메소드 : 접속(conn) → SQL 문장 전송(ps) → 결과 객체(rs) ▶ 반대로 종료
	public void dbClose() {
		try {
			if (rs != null)
				rs.close();
			if (rs != null)
				ps.close();
			if (conn != null)
				conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("dbClose Exception ! ! !");
		} // try
	}// dbClose()

	// 전체회원 목록을 검색하는 메소드 : select
	public ArrayList<MemberDTO> searchAllMember() {
		conn = getConn(); // DB에 연결
		String sql = "select * from tblMember order by num asc"; // SQL문장 (Query)작성
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>(); // 최종결과
		try {
			ps = conn.prepareStatement(sql); // SQL문장 (Query)전송
			rs = ps.executeQuery(); // 문장을 실행 후 결과객체
			while (rs.next()) {// ResultSet(결과객체)의 첫 번째부터 접근 → true(데이터 가 있다), false(데이터가 없다)
				/*
				 * int num = rs.getInt("num"); String name = rs.getString("name"); int age =
				 * rs.getInt("age"); String addr = rs.getString("addr"); String tel
				 * =rs.getString("tel"); MemberDTO dto = new MemberDTO(num, name, age, addr,
				 * tel);
				 */
				MemberDTO dto = new MemberDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));

				list.add(dto);

			} // while
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("SearchAllMember Exception ! ! !");
		} finally {
			dbClose();
		}
		return list;
	}// searchAllMember()

	// 이름 검색하는 메소드 : select ▶ 조건검색 like
	public ArrayList<MemberDTO> searchNameMember(String searchName) {
		conn = getConn();
		String sql = "select * from tblMember ";
		sql += "where upper(name) like upper(?) order by num asc";
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + searchName + "%"); // 매개변수 값 세팅
			rs = ps.executeQuery(); // 문장 실행 후 결과 객체
			while (rs.next()) { // ResultSet(결과객체)의 첫 번째부터 접근 → true(데이터 가 있다), false(데이터가 없다)
				MemberDTO dto = new MemberDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));

				list.add(dto);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("searchNameMember Exception ! ");
		} finally {
			dbClose();
		} // try
		return list;
	}// searchNameMember()

	public ArrayList<MemberDTO> serchAddrMember(String searchAddr) {
		conn = getConn();
		String sql = "select * from tblMember ";
		sql += "where addr like ? order by num asc";
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + searchAddr + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));

				list.add(dto);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("searchAddrMember Exception !");
		} finally {
			dbClose();
		} // try
		return list;
	}// serchAddrMember()

	public ArrayList<MemberDTO> searchTelMember(String searchTel) {
		conn = getConn();
		String sql = "select * from tblMember ";
		sql += "where tel like ? order by num asc";
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, "%" + searchTel + "%");
			rs = ps.executeQuery();
			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setNum(rs.getInt("num"));
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setAddr(rs.getString("addr"));
				dto.setTel(rs.getString("tel"));

				list.add(dto);
			} // while
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("searchTelMember Exception !");
		} finally {
			dbClose();
		} // try
		return list;
	}// searchTelMember()

	// 출력 메소드 구현
	public void display(ArrayList<MemberDTO> list) {
		System.out.println("=============================================================");
		if (list.size() == 0) {
			System.out.println("검색 결과가 없습니다.");
		} else {
			for (MemberDTO dto : list) {
				System.out.print(dto.getNum() + "\t");
				System.out.print(dto.getName() + "\t");
				System.out.print(dto.getAge() + "\t");
				System.out.print(dto.getAddr() + "\t");
				System.out.print(dto.getTel() + "\n");
			} // for
		} // if
		System.out.println("=============================================================");
	}// display()

	// 회원번호 존재 유무 검사 메소드
	public boolean checkNum(int num) {
		conn = getConn();
		String sql = "select * from tblMember where num = ?";
		boolean result = false; // 최종결과
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if (rs.next()) { // 검색 결과가 있다
				result = true;
			} /*
				 * else { //검색 결과 x
				 * 
				 * }
				 */
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("CheckNum Exception ! ");

		} finally {
			dbClose();

		} // try
		return result;
	}// checkNum()

	// 회원등록
	public int insertMember(MemberDTO dto) {
		conn = getConn();
		String sql = "insert into tblMember (num, name, age, addr, tel) ";
		sql += "values(?, ?, ?, ?, ?)";
		int succ = 0; // 최종결과가 저장 될 변수
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, dto.getNum()); // 매개변수 값 셋팅
			ps.setString(2, dto.getName());
			ps.setInt(3, dto.getAge());
			ps.setString(4, dto.getAddr());
			ps.setString(5, dto.getTel());

			succ = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("InsertMember Exception !");
		} finally {
			dbClose();
		} // try
		return succ;
	}// insertMember()

	// 회원정보 삭제
	public int deleteMember(int num) {
		conn = getConn();
		String sql = "delete from tblMember where num = ?";
		int succ = 0; // 최종결과가 저장 될 변수
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num); // 매개변수 값을 세팅
			succ = ps.executeUpdate(); 

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("deleteMember Exception");
		} finally {
			dbClose();
		} // try
		return succ;
	}// deleteMember()

	// 1명의 회원정보를 검색
	public MemberDTO getMember(int num) {
		conn = getConn();
		String sql = "select * from tblMember where num = ?";
		MemberDTO dto = null; // 최종 결과가 저장
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, num); // 매개변수 값 세팅
			rs = ps.executeQuery(); // SQL 문장 실행 후 결과객체
			
			if(rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				String addr = rs.getString("addr");
				String tel = rs.getString("tel");
				dto = new MemberDTO(num, name, age, addr, tel);
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("getMember Exception ");
		} finally {
			dbClose();
		} // try
		return dto;
	}// getMember()

	//회원정보 수정 
	public int updateMember(MemberDTO dto) {
		conn = getConn();
		String sql = "update tblMember set name = ?, age = ?, addr = ?, tel = ? ";
		sql += "where num = ?";
		int succ = 0;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getName());
			ps.setInt(2, dto.getAge());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getTel());
			ps.setInt(5, dto.getNum());
			succ = ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("updateMember Exception ! ");
		} finally {
			dbClose();
		}//try
		return succ;
	}//updateMember()
}// class
