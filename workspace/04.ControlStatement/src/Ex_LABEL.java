public class Ex_LABEL {
	public static void main(String[] args) {
		LABEL : 
		for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower ++) {
				System.out.println(upper + "-" + lower);
				if(lower == 'g') {
					break LABEL;			//빠져 나올 때 사용 
					
				}//if			
			}//for lower	
		}//for upper
	}//main()
}//class