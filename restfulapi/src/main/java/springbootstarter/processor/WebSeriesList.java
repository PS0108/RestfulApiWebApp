package springbootstarter.processor;

import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebSeriesList {

	@RequestMapping("/WebSeriesList")
	public List<WebSeries> getWebSeriesList()
	{
	 return Arrays.asList(new WebSeries(1, "Ozark", "Drama"),
			 			new WebSeries(2, "SpecialOps", "Thriller"),
			 			new WebSeries(3, "MoneyHeist", "Drama")
			 );
	}
	
	@RequestMapping("/WebSeriesList/{userId}")
	public List<WebSeries> getUser(@PathVariable("userId") int userId){
		return Arrays.asList(
				new WebSeries(userId, "Panchayat", "Drama")
				);
	}
}
