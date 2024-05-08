import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex10 {
	//버퍼를 이용한 이미지 파일을 복사 : 입출력 속도 향상
	//FileInputStream → BufferedInputStream
	//FileOutputStream → BufferedOutputStream
	//버퍼의 기본크기 : 1024Byte
	//마지막 버퍼에는 기본 크기보다 작은 용량이 버퍼에 남아 있다.
	//마지막 버퍼에 남아 있는 내용을 강제전송(flush()) 후에 종료(close())
	public static void main(String[] args) {
		try {
			String inputPath = "D:\\Study_Java\\workspace\\17.IO\\pic.jpg";		//원본 파일의 경로
			String outputPath = "D:\\Study_Java\\workspace\\17.IO\\copy02.jpg";	//사본 파일의 경로
			
			FileInputStream fis = new FileInputStream(inputPath);		//원본 파일을 읽는다
			FileOutputStream fos = new FileOutputStream(outputPath);	//사본 파일을 생성
			
			BufferedInputStream bis = new BufferedInputStream(fis);		//입력 버퍼를 생성
			BufferedOutputStream bos = new BufferedOutputStream(fos);	//출력 버퍼를 생성
			
			int data, cnt = 0;
			while((data = bis.read()) != -1) {
				cnt++;
				System.out.println(data);
				bos.write(data);				
			}//while
			
			bos.flush();	//마지막 버퍼에 남아 있는 내용을 강제 전송
			bos.close();
			bis.close();
			fos.close();
			fis.close();
			System.out.println("접근횟수 : " + cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
