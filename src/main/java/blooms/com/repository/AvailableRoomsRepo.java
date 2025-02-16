package blooms.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import blooms.com.entity.AvailableRooms;
@Repository
public interface AvailableRoomsRepo extends JpaRepository<AvailableRooms, Integer> {

}
