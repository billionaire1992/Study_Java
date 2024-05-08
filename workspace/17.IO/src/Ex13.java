import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex13 {
	//member.txt 파일에서 라인단위로 내용을 읽어서 ▶ 버퍼를 활용 : BufferedReader, readLine()
	//memberCopy01.txt 파일에 출력(저장) ▶ BufferedWriter, flush() → 마지막 버퍼를 강제 전송
	//파일복사 : member.txt → memberCopy01.txt
	public static void main(String[] args) {
		try {
			//파일 입력을 위한 준비단계 : FileReader, BufferedReader
			String inputPath = "D:\\Study_Java\\workspace\\17.IO\\member.txt";	//원본파일 위치
			FileReader fr = new FileReader(inputPath);	//파일 입력 스트림
			BufferedReader br = new BufferedReader(fr);	//입력 버퍼 생성
			
			//파일 출력을 위한 준비단계 : FileWriter, BufferedWriter
			String outputPath = "D:\\Study_Java\\workspace\\17.IO\\memberCopy01.txt";	//사본파일 위치
			FileWriter fw = new FileWriter(outputPath);	//파일 출력 스트림
			BufferedWriter bw = new BufferedWriter(fw);	//출력 버퍼 생성
			
			//열려진 파일의 내용을 읽어서(readLine()) 저장할 변수를 초기화
			String line = null;
			
			//파일의 내용을 읽고 파일에 출력(저장)하는 로직
			while((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();	//bw.write("\n");	//줄바꿈
			}//while
			
			//마지막 버퍼의 내용을 강제전송(flush())후 스트림 종료(close())
			bw.flush();
			bw.close();
			fw.close();
			br.close();
			fr.close();
			System.out.println("memberCopy01.txt 파일이 생성되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
