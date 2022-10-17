package dongsim.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import dongsim.bean.DongSimDTO;

public class DongSimDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSession;

	public List<DongSimDTO> quizList2(String qestion, String answer) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("qestion", qestion);
		map.put("answer", answer);
		return sqlSession.selectList("mybatis.DongSimMapper.quizList2", map);
	}

}
