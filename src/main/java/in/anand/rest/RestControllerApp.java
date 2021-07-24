package in.anand.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerApp {
	
	@GetMapping("/customerName/{custId}")
	public String getName(@PathVariable Integer customerId)
	{
		if(customerId==101)
		{
			return "Anand";
		}
		else if(customerId==102)
		{
			return "Ajay";
		}else {
			return "Teja";
		}
	}

}
