package www.study.com.party.mapper;

import org.apache.ibatis.annotations.Param;

import www.study.com.party.model.PartyVO;

public interface PartyMapper {

	// 가시성. 명시화
	public PartyVO findPartyByLoginId(@Param("loginId") String loginId);

}
