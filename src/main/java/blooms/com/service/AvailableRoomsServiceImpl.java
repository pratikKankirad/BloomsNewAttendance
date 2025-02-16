package blooms.com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

import blooms.com.entity.AvailableRooms;
import blooms.com.repository.AvailableRoomsRepo;

@Service
public class AvailableRoomsServiceImpl {
	@Autowired
	AvailableRoomsRepo availableRoomsRepo;

	public AvailableRooms addRoomData(AvailableRooms availableRooms) {
		return availableRoomsRepo.save(availableRooms);

	}

	public List<AvailableRooms> getAvailableRooms() {
		List<AvailableRooms> list = availableRoomsRepo.findAll();
		List<AvailableRooms> availabeBed = list.stream().filter(room -> room.getRoomEmptyBed() > 0)
				.collect(Collectors.toList());
		return availabeBed.isEmpty() ? null : availabeBed;

	}

	public List<AvailableRooms> getAvailableRoomsByNumber(List<AvailableRooms> listAv, int roomNumber) {
//		List<AvailableRooms> list = availableRoomsRepo.findAll();
		List<AvailableRooms> availabeBed = listAv.stream().filter(room -> room.getRoomNumber() == roomNumber)
				.collect(Collectors.toList());
		return availabeBed.isEmpty() ? null : availabeBed;

	}
	
	public List<AvailableRooms> getRoomDetailByEmptyBed(List<AvailableRooms> roomListAv, int roomEmptyBed) throws NotFoundException {
		List<AvailableRooms> availabeRoom = roomListAv.stream().filter(room -> room.getRoomEmptyBed() == roomEmptyBed)
				.collect(Collectors.toList());
		return availabeRoom.isEmpty() ? null : availabeRoom;

	}

}
