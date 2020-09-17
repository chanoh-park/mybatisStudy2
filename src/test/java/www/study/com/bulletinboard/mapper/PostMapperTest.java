package www.study.com.bulletinboard.mapper;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import www.study.com.bulletinboard.model.BulletinBoardVO;
import www.study.com.bulletinboard.model.PostVO;
import www.study.com.party.model.PartyVO;
import www.study.com.party.model.PersonVO;
import www.study.com.search.mapper.HashTagMapper;
import www.study.com.search.model.HashTagVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PostMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private PostMapper postMapper;
	private HashTagMapper hashtagMapper;
	
	/**
	 * 아이디로게시글찾기작성자정보와함께
	 */
	@Test
	public void test_aa_findPostWithWriter() {
		try {
			PostVO post = postMapper.findPostWithWriter("-1");
			System.out.println(post);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 게시글 등록 시 N:M 관계 정보 생성을 위하여 HashTag 정보 목록까지 함께 등록
	 */
	/*
	@Test
	public void test_bb_createPostWithHashTag() {
		try {
			PostVO post = new PostVO("-1", "안녕하세요");
			
			BulletinBoardVO board = new BulletinBoardVO(-1L, null);
			post.setTitle("안녕");
			post.setBoard(board);
			
			PartyVO writer = new PersonVO("a", null);
			post.setWriter(writer);
			
			post.setStrHashTag("안녕 자바 소풍");
			
			List<HashTagVO> listHashTag = post.getMutableListHashTagString();
			List<HashTagVO> listFound = hashtagMapper.findExist(listHashTag);
			listHashTag.removeAll(listFound);
			
			for (HashTagVO tag : listHashTag) {
				hashtagMapper.createHashTag(tag);
			}
			
			listHashTag.addAll(listFound);
			hashtagMapper.createMapping2Post(post.getHierarchyIid(), listHashTag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	
	@Test
	public void test_bb_createPostWithHashTag() {
		try {
			PostVO post = new PostVO("-2", "오늘도 어렵게");
			
			BulletinBoardVO board = new BulletinBoardVO(-1L, null);
			post.setTitle("안녕");
			post.setBoard(board);
			
			PartyVO writer = new PersonVO("a", null);
			post.setWriter(writer);
			
			post.setStrHashTag("가을 낙엽");
			
			List<HashTagVO> listHashTag = post.getMutableListHashTagString();
			List<HashTagVO> listFound = hashtagMapper.findExist(listHashTag);
			listHashTag.removeAll(listFound);
			
			for (HashTagVO tag : listHashTag) {
				hashtagMapper.createHashTag(tag);
			}
			
			listHashTag.addAll(listFound);
			hashtagMapper.createMapping2Post(post.getHierarchyIid(), listHashTag);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//@Test
	public void test_ab_searchPost() {
		try {
			String userSearch = "가을";
			String[] arrUserSearch = userSearch.split(" ");
			List<PostVO> listSearchResult = postMapper.searchPost(arrUserSearch);
			
			for (PostVO post : listSearchResult) {
				System.out.println(post);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
