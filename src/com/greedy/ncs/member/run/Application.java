package com.greedy.ncs.member.run;

import com.greedy.ncs.member.model.dto.MemberDTO;

public class Application {

	public static void main(String[] args) {

		MemberDTO member1 = new MemberDTO();
		MemberDTO member2 = new MemberDTO(1, "user01", "pass01", "limyeram"
				, new java.util.Date(), 180.5, 70.1, true);
		
		System.out.println(member1.toString());
		System.out.println(member2.toString());
	}

}
