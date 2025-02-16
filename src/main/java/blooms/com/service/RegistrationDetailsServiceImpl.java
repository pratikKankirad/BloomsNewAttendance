package blooms.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blooms.com.entity.RegistrationDetails;
import blooms.com.repository.RegistrationDetailsRepository;

@Service
public class RegistrationDetailsServiceImpl {
	@Autowired
	RegistrationDetailsRepository retrationrepo;

	public RegistrationDetails registersadd(RegistrationDetails registrationDetails) {
		return retrationrepo.save(registrationDetails);

	}

	public List<RegistrationDetails> getResiterdata(RegistrationDetails registrationDetails) {
		return retrationrepo.getAllRegistrationDetails(registrationDetails);

	}

}
