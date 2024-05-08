package com.hanul.member;

import java.util.ArrayList;

public class MemberDAO {
	//출력 메소드 
	public void display(ArrayList<MemberDTO> member) {
		for (MemberDTO dto : member) {
			System.out.print(dto.getName()+"\t");
			System.out.print(dto.getAge()+"\t");
			System.out.print(dto.getAddr()+"\t");
			System.out.print(dto.getTel()+"\n");
		}//for
		System.out.println("=====================================================");
	}//display()
	
	//나이의 오름차순 정렬
	public void ageAscSort(ArrayList<MemberDTO> member) {
			for (int i = 0; i < member.size(); i++) {		
				for (int j = i + 1; j < member.size(); j++) {
					if(member.get(i).getAge() > member.get(j).getAge()) {			
						MemberDTO temp = member.get(i);
						member.set(i, member.get(j));
						member.set(j, temp);
					}//if
				}//for j
			}//for i 
		}//ascSort()
	
	//이름의 내림차순 정렬
	public void nameDescSort(ArrayList<MemberDTO> member) {
		for (int i = 0; i < member.size(); i++) {		
			for (int j = i + 1; j < member.size(); j++) {
				if(member.get(i).getName().compareTo(member.get(j).getName()) < 0) {			
					MemberDTO temp = member.get(i);
					member.set(i, member.get(j));
					member.set(j, temp);
				}//if
			}//for j
		}//for i 
	}//name()
	
}//class
