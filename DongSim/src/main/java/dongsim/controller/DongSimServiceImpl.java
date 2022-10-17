package dongsim.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dongsim.bean.DongSimDTO;
import dongsim.dao.DongSimDAO;

@Service
public class DongSimServiceImpl implements DongSimService {
	
	@Autowired
	private DongSimDAO dao;

	@Override
	public List<DongSimDTO> quizList2(String qestion, String answer) {
		return dao.quizList2(qestion, answer);
	}

}
