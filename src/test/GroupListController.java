package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GroupListController {
	@RequestMapping("/")
    public String index() {
		return "grouplist";
    }
	
	@RequestMapping("/example")
	public String to_example() 
	{
		return "example";
	}
	
	@RequestMapping("/user2")
	public String to_user2() 
	{
		return "user2";
	}
}