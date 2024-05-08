import java.util.Arrays;
import java.util.Scanner;

public class Ex_SeqSearch {
	//순차검색(Sequence Search) : 데이터를 처음부터 끝까지 검색 ▶ 데이터 목록이 소량일 경우 
	public static void main(String[] args) {
		int[] arr = {30, 90 , 80 , 60 ,50, 20, 10, 70, 40 ,100};	// 데이터 목록이 저장된 배열 
		
		Ex_SeqSearch ex = new Ex_SeqSearch();
		int searchData = ex.searchData();			//찾는 수를 입력받고 리턴받는 메소드를 호출 
		int index = ex.seqSearch(arr, searchData);	//순차검색을하고 찾는 위치를 리턴받는 메소드 호출
		ex.display(arr, searchData, index);			//결과를 출력하는 메소드를 호출
	}//main()
	
	//찾는 수를 입력받고 리턴하는 메소드를 정의
	public int searchData() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("찾는 수를 입력하세요 : ");
		int searchData = Integer.parseInt(scanner.nextLine());
		scanner.close();
		return searchData;
	}//searchData()
	
	//순차검색을하고 찾는 위치를 리턴하는 메소드 정의
	public int seqSearch(int[]arr, int searchData) {
		int index = -1 ;			//프로그램에서 -1은 실패, 끝을 의미함 
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == searchData) { // 찾는 데이터 있다
				index = i + 1;			//찾는 데이터의 위치값을 구한다
				break;
			}//if
		}//for
		return index;
	}//seqSearch()
	
	public void display(int[]arr, int searchData, int index) {
		System.out.println("데이터 목록 : " + Arrays.toString(arr));
		if (index == -1) {
			System.out.println("찾는 수는 " + searchData + "이며,  검색에 실패하셨습니다.");
		}else {
			System.out.println("찾는 수는 "  + searchData+"이며 "+ index + "번째에 있습니다.");
		}//if
	}//display()
}//class
