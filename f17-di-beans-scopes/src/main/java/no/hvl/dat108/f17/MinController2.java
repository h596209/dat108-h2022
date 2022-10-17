package no.hvl.dat108.f17;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MinController2 {
	
	@Autowired
	private MinBean minBean;
	
	@GetMapping(value="/mapping2", produces="text/plain")
	@ResponseBody
	public String mapping2() {
		return "" + minBean.getId();
	}
	

}