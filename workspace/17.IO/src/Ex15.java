import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex15 {
	//현재까지의 게임정보(상태)를 byte 형으로 변환하여 game.data 파일에 저장
	//FileOutputStream → DataOutputStream, FileInputStream → DataInputStream
	public static void main(String[] args) {
		try {
			String id = "hanul7797";
			String user = "한울";
			int level = 5;
			int money = 123450;
			double score = 4567.89;
			
			FileOutputStream fos = new FileOutputStream("game.data");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(id);
			dos.writeUTF(user);
			dos.writeInt(level);
			dos.writeInt(money);
			dos.writeDouble(score);
			dos.close();
			fos.close();
			System.out.println("game.data 파일이 생성되었습니다.");
			
			FileInputStream fis = new FileInputStream("game.data");
			DataInputStream dis = new DataInputStream(fis);
			String readId = dis.readUTF();
			String readUser = dis.readUTF();
			int readLevel = dis.readInt();
			int readMoney = dis.readInt();
			double readScore = dis.readDouble();
			dis.close();
			fis.close();
			
			System.out.println("Id : " + readId);
			System.out.println("User : " + readUser);
			System.out.println("Level : " + readLevel);
			System.out.println("Money : " + readMoney);
			System.out.println("Score : " + readScore);
		} catch (Exception e) {
			e.printStackTrace();
		}//try
	}//main()
}//class
