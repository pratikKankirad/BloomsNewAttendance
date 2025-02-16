package blooms.com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegistrationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String city;
	private long mobilenumber;
	private String password;
	private String username;

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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "RegistrationDetails [id=" + id + ", name=" + name + ", city=" + city + ", mobilenumber=" + mobilenumber
				+ ", password=" + password + ", username=" + username + "]";
	}

	public RegistrationDetails(int id, String name, String city, long mobilenumber, String password, String username) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.mobilenumber = mobilenumber;
		this.password = password;
		this.username = username;
	}

	public RegistrationDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

}
