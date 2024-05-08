public class ISJPrinterExample {
	public static void main(String[] args) {
	
			      //출력 결과
				Printer.println(10);                          //10
				Printer.println(5.7);                         //5.7
				Printer.println(true);	                      //true		
				Printer.println("홍길동");                    //홍길동	   
				                                			
		
		
	}//main()
	
	public static class Printer {
		
		public static  int println(int i) {
			System.out.println(i);
			return i;
		}
		public static double println(double i) {
			System.out.println(i);
			return i;
		}
		public static boolean println(boolean i) {
			System.out.println(i);
			return true;
		}
		public static String println(String i) {
			System.out.println(i);
			return  i;
		}
		
	}
}//class

