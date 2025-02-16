package blooms.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AttednaceData {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
public int id;
public String name;
public String address;
public Long mobileNumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(Long mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "AttednaceData [id=" + id + ", name=" + name + ", address=" + address + ", mobileNumber=" + mobileNumber
			+ "]";
}
public AttednaceData(int id, String name, String address, Long mobileNumber) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
	this.mobileNumber = mobileNumber;
}
public AttednaceData() {
	super();
	// TODO Auto-generated constructor stub
}
}
