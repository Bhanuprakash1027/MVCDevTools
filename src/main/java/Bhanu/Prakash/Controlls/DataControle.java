package Bhanu.Prakash.Controlls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataControle {

	@RequestMapping("/Data")
	public String show(Model model) {
		model.addAttribute("name","bhanu");
		return "data";
	}
}

