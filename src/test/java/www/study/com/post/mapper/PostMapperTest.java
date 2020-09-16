package www.study.com.post.mapper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import www.study.com.bulletinboard.mapper.PostMapper;
import www.study.com.bulletinboard.model.PostVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PostMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private PostMapper postMapper;
	
	/**
	 * 아이디로게시글찾기작성자정보와함께
	 */
	@Test
	public void test_aa_findPostWithWriter() {
		try {
			PostVO post = postMapper.findPartyByLoginId("1");
			System.out.println(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
