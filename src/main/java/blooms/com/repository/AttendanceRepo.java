package blooms.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blooms.com.entity.AttednaceData;
@Repository
public interface AttendanceRepo extends JpaRepository<AttednaceData, Integer> {
	

}
