package www.study.com.bulletinboard.model;

import java.util.ArrayList;
import java.util.List;

import lombok.NoArgsConstructor;
import lombok.Setter;
import www.study.com.search.model.HashTagVO;

@NoArgsConstructor
public class PostVO extends ReplyVO {
	
	@Setter
	private String title;						// 게시글 제목
	
	private List<String> listHashTagString = new ArrayList<>();		// ex) "안녕 자바 소풍"
	
	// 연관된 객체 사이의 정보
	@Setter
	private BulletinBoardVO board;				// 게시판

	public PostVO(String hierarchyIid, String content) {
		super(hierarchyIid, content);
	}
	
	/* 주어진 정보로 모든 필요한 것이 제공되면 이를 받는 곳에서 처리 */
	public void setStrHashTag(String strHashTag) {
		for (String aHashTag : strHashTag.split(" ")) {
			listHashTagString.add(aHashTag);
		}
	}
	
	/**
	 * Mutable : 받은 쪽에서 마음대로 추가 삭제 하더라도 나에게는 영향 없음
	 * @return
	 */
	public List<HashTagVO> getMutableListHashTagString() {
		List<HashTagVO> ret = new ArrayList<>();
		
		for (String aStr : listHashTagString) {
			ret.add(new HashTagVO(aStr, null));
		}
		return ret;
	}

	@Override
	public String toString() {
		return "PostVO [" + toStringPropOnly() +", title=" + title + ", board=" + board + ", toString()=" + super.toString() + "]";
	}
	
}
