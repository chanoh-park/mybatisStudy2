package www.study.com.bulletinboard.model;

public class PostVO extends ReplyVO {
	
	private String title;			// 게시글 제목
	
	// 연관된 객체 사이의 정보
	private BulletinBoardVO board;	// 게시판

	@Override
	public String toString() {
		return "PostVO [" + toStringPropOnly() +", title=" + title + ", board=" + board + ", toString()=" + super.toString() + "]";
	}
	
}
