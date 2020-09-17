package www.study.com.bulletinboard.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class BulletinBoardVO {
	
	private long id;			// 아이디
	private String name;		// 이름
	
	public BulletinBoardVO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
}
