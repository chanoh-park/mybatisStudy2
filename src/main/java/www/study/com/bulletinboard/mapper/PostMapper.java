package www.study.com.bulletinboard.mapper;

import org.apache.ibatis.annotations.Param;

import www.study.com.bulletinboard.model.PostVO;

/**
 * Mapper는 Mybatis에 의하여 객체가 만들어 져야합니다.
 * 따라서 Root-Context에 등재가 필수.
 * @author admin
 *
 */
public interface PostMapper {

	public PostVO findPartyByLoginId(@Param("postId") String postId);

}
