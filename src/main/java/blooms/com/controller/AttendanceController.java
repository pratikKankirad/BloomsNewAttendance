package blooms.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import blooms.com.entity.AttednaceData;
import blooms.com.service.AttendanceServiceImpl;

@RestController
@RequestMapping("/api")
public class AttendanceController {
	@Autowired
	AttendanceServiceImpl attendanceServiceImpl;
	
	@PostMapping("/data")
    public ResponseEntity<AttednaceData> createUser(@RequestBody AttednaceData AttednaceData) {
		AttednaceData savedUser = attendanceServiceImpl.saveData(AttednaceData);
        return ResponseEntity.ok(savedUser);
    }
	@GetMapping("/AllData") 
	public ResponseEntity<List<AttednaceData>> getuserData(){
		List<AttednaceData> getUser =(List<AttednaceData>) attendanceServiceImpl.getData();
		return ResponseEntity.ok(getUser);		
	}

}
