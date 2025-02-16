package blooms.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blooms.com.entity.AvailableRooms;
import blooms.com.repository.AvailableRoomsRepo;
import blooms.com.service.AvailableRoomsServiceImpl;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/available")
public class AvailableRoomsController {
	@Autowired
	AvailableRoomsServiceImpl availableRoomsServiceImpl;
	@Autowired
	AvailableRoomsRepo availableRoomsRepo;

	@PostMapping("/addroomsdata")
	public AvailableRooms addRoomsDeatils(@RequestBody AvailableRooms availableRooms) {
		return availableRoomsServiceImpl.addRoomData(availableRooms);
	}

	@GetMapping("/getEmptyBed")
	public List getEmptyBeds() {
		return availableRoomsServiceImpl.getAvailableRooms();

	}

	@GetMapping("/getEmptyBedByRommNumber/{roomNumber}")
	public List<AvailableRooms> getAvailableRoomsByNumber(@PathVariable int roomNumber) {
		// Fetch all rooms from DB
		List<AvailableRooms> allRooms = availableRoomsRepo.findAll();

		// Call service method to filter rooms by roomNumber
		List<AvailableRooms> availableRooms = availableRoomsServiceImpl.getAvailableRoomsByNumber(allRooms, roomNumber);

		return availableRooms;
	}

	@GetMapping("/getRoomDetailByEmptyBed/{roomEmptyBed}")
	public List<AvailableRooms> getRoomDetailByEmptyBed(@PathVariable int roomEmptyBed) throws NotFoundException {
		// Fetch all rooms from DB
		List<AvailableRooms> allRoomsDetail = availableRoomsRepo.findAll();

		// Call service method to filter rooms by roomNumber
		List<AvailableRooms> availableRoometails = availableRoomsServiceImpl.getRoomDetailByEmptyBed(allRoomsDetail,
				roomEmptyBed);

		return availableRoometails;
	}
}
