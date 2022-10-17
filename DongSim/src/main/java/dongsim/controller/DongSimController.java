package dongsim.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import dongsim.bean.DongSimDTO;

@Controller
public class DongSimController {
	
	@Autowired
	private DongSimService dongsimService;
	
	
		@RequestMapping(value="../Quiz/quizList.do")
		public ModelAndView quizList(HttpServletRequest request) {
		
			String qestion = request.getParameter("qestion");
			String answer = request.getParameter("answer");
			
			List<DongSimDTO> List3 = dongsimService.quizList2(qestion, answer);
			
			
			ModelAndView modelAndView = new ModelAndView();
			
			modelAndView.addObject("List",List3);
			modelAndView.addObject("qestion", qestion);
			modelAndView.addObject("answer", answer);
			
			
			modelAndView.setViewName("quizList.jsp");
			
			return modelAndView;
		}

}
