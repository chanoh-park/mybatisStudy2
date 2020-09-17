package www.study.com.bulletinboard.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import www.study.com.bulletinboard.model.PostVO;

/**
 * Mapper는 Mybatis에 의하여 객체가 만들어 져야합니다.
 * 따라서 Root-Context에 등재가 필수.
 * @author admin
 *
 */
public interface PostMapper {

	public PostVO findPostWithWriter(@Param("postId") String postId);

	public List<PostVO> searchPost(@Param("arrUserSearch") String[] arrUserSearch);

}
