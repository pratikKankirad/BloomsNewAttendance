package blooms.com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blooms.com.entity.AvailableRooms;
import blooms.com.entity.RegistrationDetails;
import blooms.com.repository.AvailableRoomsRepo;
import blooms.com.service.RegistrationDetailsServiceImpl;

@RestController
@RequestMapping("/register")
public class RegistrationDetailsController {
	@Autowired
	RegistrationDetailsServiceImpl registrationservice;
	@Autowired
	AvailableRoomsRepo availableRoomsRepository;

	@PostMapping("/addData")
	public RegistrationDetails registerDatato(@RequestBody RegistrationDetails RegistrationDetails) {

		return registrationservice.registersadd(RegistrationDetails);

	}

	@GetMapping("/get")
	public List<RegistrationDetails> getData(RegistrationDetails details) {
		return registrationservice.getResiterdata(details);

	}
	 // Update room details
    @PutMapping("/{id}")
    public ResponseEntity<AvailableRooms> updateRoom(@PathVariable int id, @RequestBody AvailableRooms updatedRoom) {
        Optional<AvailableRooms> existingRoom = availableRoomsRepository.findById(id);
        
        if (existingRoom.isPresent()) {
            AvailableRooms room = existingRoom.get();
            room.setRoomNumber(updatedRoom.getRoomNumber());
            room.setRoomSharingDigit(updatedRoom.getRoomSharingDigit());
            room.setRoomEmptyBed(updatedRoom.getRoomEmptyBed());

            availableRoomsRepository.save(room);
            return ResponseEntity.ok(room);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

