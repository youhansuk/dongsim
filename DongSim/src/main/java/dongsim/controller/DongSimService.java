package dongsim.controller;

import java.util.List;

import dongsim.bean.DongSimDTO;



public interface DongSimService {
    
	   
		public List<DongSimDTO> quizList2(String qestion, String answer);
}
