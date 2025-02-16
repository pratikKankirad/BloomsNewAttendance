package blooms.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blooms.com.entity.RegistrationDetails;
import blooms.com.service.RegistrationDetailsServiceImpl;

@RestController
@RequestMapping("/register")
public class RegistrationDetailsController {
	@Autowired
	RegistrationDetailsServiceImpl registrationservice;

	@PostMapping("/addData")
	public RegistrationDetails registerDatato(@RequestBody RegistrationDetails RegistrationDetails) {

		return registrationservice.registersadd(RegistrationDetails);

	}
	@GetMapping("/get")
	public List<RegistrationDetails> getData(RegistrationDetails details)
	{
		return registrationservice.getResiterdata(details);
		
	}

}
