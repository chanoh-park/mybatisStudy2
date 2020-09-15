package www.study.com.party.model;

import lombok.Getter;

public class PersonVO extends PartyVO {
	
	private String gender;		// 성별

	public PersonVO(String loginId, String pwd) {
		super(loginId, pwd);
	}
	
}
