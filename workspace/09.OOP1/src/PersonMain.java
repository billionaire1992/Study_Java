public class PersonMain {
	public static void main(String[] args) {
	
		
	PersonDTO[] pr =  new PersonDTO[3];
		
	pr[0]= new PersonDTO("홍길동","남",33, 175.5, 75);	
	pr[1]= new PersonDTO("박문수","남",30, 180, 65.5);	
	pr[2]= new PersonDTO("성춘향","여",28, 165, 48.5);	
		
	

	
	
	PersonDAO dao = new PersonDAO();
	dao.display(pr);
	dao.ageAscSort(pr);		//나이의 오름차순 정렬 
	dao.display(pr);		//출력
	dao.heightDescSort(pr);
	dao.display(pr);
	
	
	}//main()
}//class
