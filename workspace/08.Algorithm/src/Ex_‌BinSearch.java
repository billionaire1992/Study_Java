public class Ex_‌BinSearch {
	//이진검색 (Binary Search) : low, middle , high 값을 사용 
	//찾고자 하는 데이터를 중앙에 위치한 중간값(middle)과 비교하는 방법 
	//(전제조건) 데이터 목록은 반드시 사전에 오름차순으로 정렬되어 있어야한다.
	public static void main(String[] args) {
		int [] arr = {10 ,20, 30, 40, 50, 60 ,70 ,80, 90, 100};			//오름차순으로 정렬된 데이터 목록
		
		//찾는 수를 입력받는다 ▶ Ex_SeqSearch.java
		Ex_SeqSearch seqSearch = new Ex_SeqSearch();					//객체생성
		int searchData = seqSearch.searchData();						//메소드 호출
		
		//이진검색하고 결과를 리턴받는 메소드를 호출
		Ex_‌BinSearch binSearch = new Ex_‌BinSearch();
		int index = binSearch.binSearch(arr,searchData);
		seqSearch.display(arr, searchData, index);
	}//main()
	
		//이진검색하고 결과를 리턴하는 메소드를 정의
	public int binSearch(int[] arr, int searchData) {
		int index = -1;
		int low = 0, middle = 0 , high =arr.length -1;
		while(low <= high) {
			middle = (low + high) / 2 ;		//중간값이 저장된 배열의 index 4 ///int 로 계산
			if(arr[middle] == searchData) {
				index = middle + 1;
				break;
			}else if (arr[middle] < searchData) {
				low = middle + 1;								//low포인터 변경 : 중간값을 기준으로 왼쪽 부분을 제외
			}else {	
				high = middle -1;								//high 포인터 변경 :  중간값을 기준으로 오른쪽 부분을 제외 
			}//
		}//while
		return index;
	}//binSearch
}//class
