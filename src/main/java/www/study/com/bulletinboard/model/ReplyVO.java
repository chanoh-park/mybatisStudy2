package www.study.com.bulletinboard.model;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import www.study.com.party.model.PartyVO;

@NoArgsConstructor
public class ReplyVO {
	
	@Getter
	private String hierarchyIid;		// 계층구조에 따른 아이디
	private String content;				// 게시글 내용
	private Date regDate;				//-- 등록일 년월일시분초
	private Date updateDate;			//-- 수정일 년월일시분초
	
	// 연관된 객체 사이의 정보
	@Setter
	private PartyVO writer;			// 게시글 작성자

	public ReplyVO(String hierarchyIid, String content) {
		super();
		this.hierarchyIid = hierarchyIid;
		this.content = content;
	}

	@Override
	public String toString() {
		return "ReplyVO [hierarchyIid=" + hierarchyIid + ", content=" + content + ", writerId=" + writer + "]";
	}
	
	protected String toStringPropOnly() {
		return "hierarchyIid=" + hierarchyIid + ", writerId=" + writer;
	}

}

