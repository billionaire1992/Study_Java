import java.text.DecimalFormat;

public class PersonDAO {
	public void display(PersonDTO[] pr) {
		DecimalFormat df = new DecimalFormat("#.#");
		System.out.println("이름\t성별\t나이\t키\t체중");

		for (int i = 0; i < pr.length; i++) {
			System.out.print(pr[i].getName()+"\t");
			System.out.print(pr[i].getGender()+"\t");
			System.out.print(pr[i].getAge()+"\t");
			System.out.print(df.format(pr[i].getHeight())+"\t");
			System.out.print(df.format(pr[i].getWeight())+"\n");
			System.out.println();
		
		}//for
	}//display()

	public void ageAscSort(PersonDTO[] pr) {
		for (int i = 0; i < pr.length; i++) {
			for (int j = 1; j < pr.length; j++) {
				if(pr[i].getAge() > pr[j].getAge()) {
				PersonDTO temp = pr[i];
				pr[i] = pr[j];
				pr[j] = temp;
				}//if
			}//for j
		}//for i
	}//ascAgeSort()

	public void heightDescSort(PersonDTO[] pr) {
		for (int i = 0; i < pr.length; i++) {
			for (int j = 1; j < pr.length; j++) {
				if(pr[i].getHeight() < pr[j].getHeight()) {
					PersonDTO temp = pr[i];
					pr[i] = pr[j];
					pr[j] = temp;
				}//if
			}//for j
		}//for i 
	}//heightDescSort()
}//class

