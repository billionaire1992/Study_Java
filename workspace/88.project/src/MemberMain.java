import java.util.Scanner;

import dato.MemberDAO;
import dato.MemberInput;

import dato.login;

public class MemberMain {
   public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      MemberInput mm = new MemberInput(sc);
      MemberDAO dao = new MemberDAO();
      MemberMain m = new MemberMain();
      login lg = new login();
      boolean check = true;
      while(true) {
         if(check) {
            System.out.println("********************프로그램 실행**********************");
            lg.display();
            System.out.print("메뉴를 입력하세요:");
            }
         int menu = Integer.parseInt(sc.nextLine());
         if(menu == 1) {
            System.out.println("로그인");
            boolean log = m.login(sc);
            if(log) {
               System.out.println("로그인 성공");
               check = false;
               lg.logdisplay();
               System.out.println("메뉴를 선택해주세요:");
               int logmenu = Integer.parseInt(sc.nextLine());
               if(logmenu == 1) {//회원정보 수정
                  mm.updateInput();
       
                  if(log) {
                	  System.out.println("수정 성공");
                      check = false;
                      lg.display();
                      System.out.print("메뉴를 선택해주세요:");
                	  
                  }
               }else if (logmenu == 2) {//회원정보 탈퇴
                  //mm.deleteInput();

               }
               

            }else {
               System.out.println("아이디나 비밀번호가 틀림.");
               break;
            }    
            
         }else if(menu==2) {
            mm.insertInput();
         }
         else if(menu ==3) {
            check = false;
            lg.NoticeTBL();
            System.out.println("나가시겠습니까 (Y)?");
            String  yn = sc.nextLine();
            if(yn.equalsIgnoreCase("Y")){
            	continue;
            }
         }else if (menu == 4) {
            System.out.print("정말 종료 하시겠습니까?(Y/N) : ");
            String exit = sc.nextLine();
            if(exit.equalsIgnoreCase("y")) {
               System.out.println("회원관리 프로그램을 종료합니다!");
               sc.close();
               System.exit(0);   //프로그램을 종료하고 메모리에서 관련 프로세스를 제거
               break;
            }else if(exit.equalsIgnoreCase("n")) {
               System.out.println("회원관리 프로그램을 계속 진행합니다.");
               continue;
            }else {
               System.out.println("잘못 입력하셨습니다!");
               continue;
            }//if
         }else {
            System.out.println("잘못입력하셨습니다");
            continue;
         }
      }
   }//main
   
   boolean login (Scanner sc) {
      MemberDAO dao = new MemberDAO();
      
      System.out.println("아이디를 입력하세요:");
      String id = "admin";
      System.out.println("비밀번호를 입력하세요:");
      String pw = "1234";
      //int oo = dao.login(id, pw);
      boolean oo = dao.checkpw(id, pw);
      return oo;

   }
   
   
}//class