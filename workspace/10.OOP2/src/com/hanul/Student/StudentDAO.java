package com.hanul.Student;

import java.text.DecimalFormat;



public class StudentDAO {
	
	public StudentDAO() {}
	private StudentDTO[] student;
	
	
	public StudentDAO(StudentDTO[] student) {
		this.student = student;
	}
	
	//총점계산
	public void getSum() {
		for (int i = 0; i < student.length; i++) {
			student[i].setSum(student[i].getCpp() + student[i].getJava());	
		}//for	
	}//getSum()
	
	//평균계산
	public void getAvg() {
		for (int i = 0; i < student.length; i++) {
			student[i].setAvg(student[i].getSum() / 2);
		}//for	
	}//getAvg
	
	//내림차순 정렬
	public void avgDescSort() {
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if(student[i].getAvg() < student[j].getAvg()) {
					StudentDTO temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}//if
			}//for j
		}//for i	
	}//avgDescSort
	
	//출력메소드 
	public void display() {
		DecimalFormat df = new DecimalFormat("0.#");
		System.out.println("============================================================");
		System.out.println("이름\t학번\t\t학과\tC++\tJAVA\t합계\t평균");
		System.out.println("============================================================");
		for (int i = 0; i < student.length; i++) {
			System.out.print(student[i].getName()+"\t");
			System.out.print(student[i].getNum()+"\t");
			System.out.print(student[i].getMajor()+"\t");
			System.out.print(df.format(student[i].getCpp())+"\t");
			System.out.print(df.format(student[i].getJava())+"\t");
			System.out.print(df.format(student[i].getSum())+"\t");
			System.out.print(df.format(student[i].getAvg())+"\n");
		}//for
		System.out.println("============================================================");
	}//display()
	
	//오름차순정렬 
	 public void nameAscSort() {
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {				
				if(student[i].getName().compareTo(student[j].getName()) > 0) {
					StudentDTO temp = student[i];
					student[i]= student[j];
					student[j]= temp;
				}//if
			}//for j
		}//for i
		
	}//nameAscSort() 
}//class
