package www.study.com.bulletinboard.model;

import www.study.com.party.model.PartyVO;

public class ReplyVO {
	
	private String hierarchyIid;		// 계층구조에 따른 아이디
	private String content;				// 게시글 내용
	
	// 연관된 객체 사이의 정보
	private PartyVO writer;			// 게시글 작성자

	@Override
	public String toString() {
		return "ReplyVO [hierarchyIid=" + hierarchyIid + ", content=" + content + ", writerId=" + writer + "]";
	}
	
	protected String toStringPropOnly() {
		return "hierarchyIid=" + hierarchyIid + ", writerId=" + writer;
	}

}

