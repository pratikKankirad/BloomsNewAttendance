package blooms.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AvailableRooms {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public int roomNumber;
	public int roomSharingDigit;
	public int roomEmptyBed;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getRoomSharingDigit() {
		return roomSharingDigit;
	}
	public void setRoomSharingDigit(int roomSharingDigit) {
		this.roomSharingDigit = roomSharingDigit;
	}
	public int getRoomEmptyBed() {
		return roomEmptyBed;
	}
	public void setRoomEmptyBed(int roomEmptyBed) {
		this.roomEmptyBed = roomEmptyBed;
	}
	@Override
	public String toString() {
		return "availableRooms [roomNumber=" + roomNumber + ", roomSharingDigit=" + roomSharingDigit + ", roomEmptyBed="
				+ roomEmptyBed + ", id=" + id + "]";
	}
	public AvailableRooms(int roomNumber, int roomSharingDigit, int roomEmptyBed, int id) {
		super();
		this.roomNumber = roomNumber;
		this.roomSharingDigit = roomSharingDigit;
		this.roomEmptyBed = roomEmptyBed;
		this.id = id;
	}
	public AvailableRooms() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
