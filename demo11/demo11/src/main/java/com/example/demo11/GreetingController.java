package com.example.demo11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

}

//is flagged as a @RestController, meaning it is ready for use by Spring MVC to handle web requests.
// @GetMapping maps / to the index() method. When invoked from a browser or by using curl on the command line,
// the method returns pure text. That is because @RestController combines @Controller and @ResponseBody,
// two annotations that results in web requests returning data rather than a view.
