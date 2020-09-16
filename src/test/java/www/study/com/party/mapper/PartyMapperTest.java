package www.study.com.party.mapper;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import www.study.com.party.model.PartyVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PartyMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private PartyMapper partyMapper;
	
	@Test
	public void test_aa_사용자아이디바탕으로찾기() {
		try {
			PartyVO party = partyMapper.findPartyByLoginId("a");
			System.out.println(party);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test_ab_사용자를연락처까지함께아이디바탕으로찾기() {
		try {
			// Method Signiture
			PartyVO party = partyMapper.findPartyWithContactPointByLoginId("a");
			System.out.println(party);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
