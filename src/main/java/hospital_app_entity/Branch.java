package hospital_app_entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {

	@Id
	private int branch_id;
    
	
	@ManyToOne
	@JoinColumn(name="hospital_id")
	private Hospital hospital;
	
	@OneToOne
	@JoinColumn(name="address")
	private Address address;
	
	@OneToMany(mappedBy = "branch")
	private List<Encounter> ecounter;
	
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Encounter> getEcounter() {
		return ecounter;
	}

	public void setEcounter(List<Encounter> ecounter) {
		this.ecounter = ecounter;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String location;
	private String name;

}
