package blooms.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import blooms.com.entity.AttednaceData;
import blooms.com.repository.AttendanceRepo;

@Service
public class AttendanceServiceImpl {
	@Autowired
	AttendanceRepo attendanceRepo;

	public AttednaceData saveData(AttednaceData attednaceData)

	{
		return attendanceRepo.save(attednaceData);

	}
	public List<AttednaceData> getData() {
		return attendanceRepo.findAll();
		
	}
	
	

}
