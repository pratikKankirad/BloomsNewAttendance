package blooms.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import blooms.com.entity.RegistrationDetails;

public interface RegistrationDetailsRepository extends JpaRepository<RegistrationDetails, Integer> {
	@Query("SELECT r FROM RegistrationDetails r")
	List<RegistrationDetails> getAllRegistrationDetails(RegistrationDetails registrationDetails);
}
