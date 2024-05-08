import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

//AWT, SWING : JAVA에서 제공하는 GUI
public class LottoGameSwing {
	//컴포넌트 선언
	JFrame frame;
	JTextArea output;
	JPanel panel;
	JButton startBtn;
	JButton clearBtn;	
	
	//생성자 메소드 : 코드구현 → 객체가 생성될 때 동작되는 메소드
	public LottoGameSwing() {
		//컴포넌트 생성
		frame = new JFrame();
		output = new JTextArea();
		panel = new JPanel();
		startBtn = new JButton("번호생성");
		clearBtn = new JButton("번호삭제");
		
		//startBtn과 clearBtn을 panel에 묶어준다(등록)
		panel.add(startBtn);
		panel.add(clearBtn);
		
		//output의 글꼴 스트일을 변경
		output.setFont(new Font("굴림", Font.BOLD, 20));
		
		//frame에 output와 panel 배치
		frame.getContentPane().add(new JScrollPane(output), BorderLayout.CENTER);
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		//frame 속성 설정
		frame.setTitle("Lotto Game");	//제목표시줄 출력내용
		frame.setSize(300, 300);		//window 크기
		frame.setVisible(true);			//화면에 표시
		frame.setLocationRelativeTo(null);	//화면 중앙에 표시
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//닫기 단추 클릭시 종료
		
		//이벤트 처리를 위한 Listener 클래스와 연계
		startBtn.addActionListener(new StartBtnListener());
		clearBtn.addActionListener(new ClearBtnListener());
	}
	
	//번호생성 이벤트 클래스 : 중첩클래스
	class StartBtnListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {			
			LottoGame game = new LottoGame();
			int[] lotto = game.getNumber();
			for (int i = 0; i < lotto.length; i++) {
				if(lotto[i] < 10) {
					output.append("0" + lotto[i] + "  ");
				}else {
					if(i < lotto.length - 1) {
						output.append(lotto[i] + "  ");
					}else {
						output.append(lotto[i] + "");
					}//if
				}//if
			}//for
			output.append("\n");
		}
	}//class	
	
	//번호삭제 이벤트 클래스 : 중첩클래스
	class ClearBtnListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				int start = output.getSelectionStart() - 23; //선택부분의 시작점
				int end = output.getSelectionEnd(); //선택부분의 끝점
				output.replaceRange("", start, end); //시작부분과 끝점 사이를 공백으로 교체
			} catch (Exception exception) {
				output.append("삭제할 자료가 없습니다!\n");
			}
		}
	}//class	
	
	public static void main(String[] args) {
		new LottoGameSwing();	//LottoGameSwing 객체 생성
	}//main()
}//class