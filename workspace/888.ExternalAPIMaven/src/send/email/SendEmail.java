package send.email;

import java.net.URL;

import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;

public class SendEmail {
	public static void main(String[] args) {
	SendEmail se = new SendEmail();
	//se.sendSimple(); //인스턴스 멤버 중 메소드 실행 
	//se.sendAttach();	
	se.htmlEmail();	
	}//main()
	//simple 일반글자만 전송하는 이메일 (String)
	//sendAttach 파일 첨부가 있는 이메일
	//htmlEmail  HTML 태그를 이용해서 메일을 꾸민 이메일
	
	//※ API자체가 사용법에 따라서 그냥 사용만 한것이기 때문에 
	//따로 공부할 필요가 없다 ※
	
void htmlEmail() {
		
		HtmlEmail mail = new HtmlEmail();
		//getter & setter (세팅)
		
		mail.setHostName("smtp.naver.com"); //메일 서버
		mail.setCharset("utf-8");
		mail.setDebug(true);				//디버깅 모드 설정 
		
		mail.setAuthentication("tmdwls170", "d");
		mail.setSSLOnConnect(true); 		//SMTP 방식에서는 true
		
		//SMTP사용시 무조건 해줘야 하는 부분 ↑
		try {
			//메일 송신인 지정 
			mail.setFrom("tmdwls170@naver.com","임승진");
			
			//메일 수신인 지정
			mail.addTo("rkddbs3469@naver.com","김강윤");

			//메일 제목 내용
			mail.setSubject("html zz ");
			StringBuffer msg = new StringBuffer();
			msg.append("<html>");  
			msg.append("<body>");
			msg.append("<a href='www.naver.com'>네이버 바로가기</a>");
			msg.append("</body>");  
			msg.append("</html>"); 
			
			mail.setHtmlMsg(msg.toString());
			
			//파일 첨부 로직 추가 (기존 + 기능)
			//java에서 Stream 파일을 읽을 때는 권한부족으로 
			//못읽어서 오류나는 경우가 더러 있음 
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_View\\starbucks_clone\\src\\main\\webapp\\images\\footer_award28.jpg");
			mail.attach(file);
			
			file = new EmailAttachment();
			try {
				file.setURL(new URL("https://www.theaction.co.kr/web/product/big/202203/92c51f80a20bfa36de42e136b2835ceb.jpg"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			mail.send();	
			
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}
	
	void sendAttach() {
		
		MultiPartEmail mail = new MultiPartEmail();
		//getter & setter (세팅)
		
		mail.setHostName("smtp.naver.com"); //메일 서버
		mail.setCharset("utf-8");
		mail.setDebug(true);				//디버깅 모드 설정 
		
		mail.setAuthentication("tmdwls170", "d");
		mail.setSSLOnConnect(true); 		//SMTP 방식에서는 true
		
		//SMTP사용시 무조건 해줘야 하는 부분 ↑
		try {
			//메일 송신인 지정 
			mail.setFrom("tmdwls170@naver.com","임승진");
			
			//메일 수신인 지정
			mail.addTo("rkddbs3469@naver.com","김강윤");

			//메일 제목 내용
			mail.setSubject("제목 ");
			mail.setMsg("내용 ");
			
			//파일 첨부 로직 추가 (기존 + 기능)
			//java에서 Stream 파일을 읽을 때는 권한부족으로 
			//못읽어서 오류나는 경우가 더러 있음 
			
			EmailAttachment file = new EmailAttachment();
			file.setPath("D:\\Study_View\\starbucks_clone\\src\\main\\webapp\\images\\footer_award28.jpg");
			mail.attach(file);
			
			file = new EmailAttachment();
			try {
				file.setURL(new URL("https://www.theaction.co.kr/web/product/big/202203/92c51f80a20bfa36de42e136b2835ceb.jpg"));
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			mail.send();	
			
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}
	

	void sendSimple() {
		SimpleEmail mail = new SimpleEmail();
		//getter & setter (세팅)
		
		mail.setHostName("smtp.naver.com"); //메일 서버
		mail.setCharset("utf-8");
		mail.setDebug(true);				//디버깅 모드 설정 
		
		mail.setAuthentication("tmdwls170", "비밀번호 ");
		mail.setSSLOnConnect(true); 		//SMTP 방식에서는 true
		
		//SMTP사용시 무조건 해줘야 하는 부분 ↑
		try {
			//메일 송신인 지정 
			mail.setFrom("tmdwls170@naver.com","임승진");
			
			//메일 수신인 지정
			mail.addTo("rkddbs3469@naver.com","김강윤");

			//메일 제목 내용
			mail.setSubject("제목");
			mail.setMsg("내용");
			
			mail.send();
			
			
		} catch (EmailException e) {
			e.printStackTrace();
		}
		
	}
	
	
}//class
