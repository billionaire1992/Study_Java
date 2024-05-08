package dato;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	private Connection conn;		//연결
	private PreparedStatement ps;	//전송
	private ResultSet rs;			//결과
	
	//DB연결 정보 메소드
	public Connection getConn() {
		try {
			String user = "hanul";
			String password = "0000";
			String url = "jdbc:oracle:thin:@121.147.215.32:1521:XE";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			try {
				conn = DriverManager.getConnection(url,user,password);
				//System.out.println("DB계정 일치");
			}catch (Exception e) {
				//System.out.println("DB계정 불일치");
				e.printStackTrace();
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB연결 오류");
		}
		return conn;
	}//getConn()
	
	//DB접속 종료 메소드:
	public void dbClose() {
		
		try {
		if(rs!=null) rs.close();
		if(ps!=null) ps.close();
		if(conn != null) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("DB종료 오류");
		}
	}//DBclose()
	
	//출력 메소드
	public void show (ArrayList<MemberDTO> list) {
		MemberDTO mo = new MemberDTO();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
		if(list.size()==0) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for (MemberDTO d : list) {
				System.out.print(d.getId()+"\t");
				System.out.print(d.getPw()+"\t");
				System.out.print(d.getName()+"\t");
				System.out.println(d.getEmail()+"\t");
				System.out.println(d.getMoney()+"\n");
			}
		}//if&else
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	}//show()
	
	//전체회원 목록 검색 메소드 : select
	public ArrayList<MemberDTO> searchAllMember(){
		conn = getConn(); //DB연결 & 계정일치 확인
		String sql = "select * from tblMember302 order by name asc";
		ArrayList<MemberDTO> list = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString("id"));
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setMoney(rs.getInt("money"));
				
				list.add(dto);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();		//접속 해제
		}
		return list;
	}
	
	
	//회원 넣기
	public int insertMember(MemberDTO dto) {
		conn = getConn();
		String sql = "insert into tblMember302 (id, pw, name, email,money) ";
		sql += "values(?,?,?,?,?)";
		int succ = 0;
		
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getEmail());
			ps.setInt(5, dto.getMoney());
			succ = ps.executeUpdate();
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println("회원등록 오류났슈");
		}finally {
			dbClose();
		}
		return succ;
	}
	
	//회원 수정
		public int updateMember(MemberDTO dto) {
			conn = getConn();
			String sql = "update tblMember302 set id = ?, pw = ?, name = ?, email = ?,money =? ";
			sql += "values(?,?,?,?,?)";
			int succ = 0;
			
			try {
				ps = conn.prepareStatement(sql);
				ps.setString(1, dto.getId());
				ps.setString(2, dto.getPw());
				ps.setString(3, dto.getName());
				ps.setString(4, dto.getEmail());
				ps.setInt(5, dto.getMoney());
				succ = ps.executeUpdate();
				
			}catch (Exception e) {
				e.printStackTrace();
				System.out.println("회원수정 오류났슈");
			}finally {
				dbClose();
			}
			return succ;
		}
	
	//회원정보 삭제
		
		public int deleteMember(int num) {
			conn = getConn();
			String sql = "delete from tblMember where num = ?";
			int succ = 0;
			try {
				ps = conn.prepareStatement(sql);
				ps.setInt(1, num);
				succ = ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("정보 삭제 오류");
			}finally {
				dbClose();
			}
			return succ;
		}//delM
	
		
	//로그인
		public int login(String userID, String userPassword) {
			conn = getConn();
			String SQL = "select pw from tblMember302 where id = ?";
			try {
				ps = conn.prepareStatement(SQL);
				ps.setString(1, userID);
				rs = ps.executeQuery();
				if(rs.next()) {
					if(rs.getString(1).contentEquals(userPassword)) {
						return 1;
					}
					else {
						return 0;
					}
				}
				return -1;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("로그인쪽에서 오류남");
			}
			return -2; //DB오류
		}
		
		
	//아이디 비번 일치여부 확인 -영건씨
			public boolean checkpw(String id, String pw) {
				conn = getConn();	//DB접속
				String sql = "select pw from tblMember302 where id = ? and  pw = ?";	//SQL 문장작성
				boolean result = false;	//최종결과 저장:번호 일치여부는 0아님 1 두가지경우만나옴
				
				try {
					ps = conn.prepareStatement(sql);	//SQL문장 전송
					ps.setString(1, id); 					//매개변수값 세팅 
					ps.setString(2, pw);
					rs = ps.executeQuery();	//문장 실행 후 결과객체한테 넘김
					if(rs.next()) {	//결과값 2개니까 if로. 검색결과가 있을 때
						result=true;
						} else {		//검색결과가 없을 때
						result = false;
						}//if			
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("로그인 확인해주세요");
					} finally {
						dbClose();
					}//try
					return result;
				}
					
		//회원번호 존재여부 판단(번호 검색)하는 메소드 : select -영건씨
		public boolean checkNum(String id) {
			conn = getConn();	//DB접속
			String sql = "select * from tblMember302 where id = ?";	//SQL 문장작성
			boolean result = false;	//최종결과 저장:번호 일치여부는 0아님 1 두가지경우만나옴
				
			try {
				ps = conn.prepareStatement(sql);	//SQL문장 전송
				ps.setString(1, id ); 					//매개변수값 세팅 
				rs = ps.executeQuery();	//문장 실행 후 결과객체한테 넘김
				if(rs.next()) {	//결과값 2개니까 if로. 검색결과가 있을 때
					result = true;
				} else {		//검색결과가 없을 때
					result = false;
				}//if			
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("checkNum Exception");
			} finally {
				dbClose();
			}//try
			return result;
			}//checkNum()	
		
		
		//1명의 회원정보를 검색 - 영건씨
				public MemberDTO getMember(String id) {
					conn = getConn();		//DB접속
					String sql = "select * from tblMember302 where id = ?";		//SQL문장작성
					MemberDTO dto = null; 	//한사람, 최종결과가 저장될 항목 만들어줌
					
					try {
						ps = conn.prepareStatement(sql);//SQL 문장전송
						ps.setString(1, id);				//매개변수값 세팅
						rs = ps.executeQuery(); 		//SQL문장 실행 후 결과객체
						
						if(rs.next()) {							
							
							String pw = rs.getString("pw");
							String name = rs.getString("name");
							String admin = rs.getString("admin");
							String email = rs.getString("email");
							int money = rs.getInt("money");
							//JAVA = DB : ResultSet(rs) DB에서 넘겨준 값
							dto = new MemberDTO();				
						}//if
					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("getMember() Exception");
					} finally {
						dbClose();
					}//try
					return dto;
				}//getMember		
		
				//멤버 넣기 강윤&승진&옥철
				/*public int insertMember(MemberDTO dto) {
					conn = getConn();
					String sql = "insert into TBLMEMBER302 (id, pw, name, email, money) ";
					sql += "values(?, ?, ?, ?, ? )";
					int succ = 0; 
					try {
						ps = conn.prepareStatement(sql);
						ps.setString(1, dto.getId()); 
						ps.setString(2, dto.getPw());
						ps.setString(3, dto.getName()); 
						ps.setString(4, dto.getEmail());
						ps.setInt(5, dto.getMoney());
						
						succ = ps.executeUpdate();

					} catch (Exception e) {
						e.printStackTrace();
						System.out.println("InsertMember Exception !");
					} finally {
						dbClose();
					} // try
					return succ;
				}// insertMember()*/
		
		
		
		
		
		
		
		
	
}//class
