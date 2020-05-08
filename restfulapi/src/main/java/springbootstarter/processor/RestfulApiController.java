package springbootstarter.processor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestfulApiController {

	
	@RequestMapping("/hello")
	public String sayHi()
	{
		return "Hi";
	}
}
