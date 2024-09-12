package hospital_app_entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	
	@ManyToOne
	@JoinColumn(name ="branch_loc")
	private Branch branch;
	
	@OneToMany(mappedBy = "encounter")
	private List<MedOrders> medorders;
	
	@ManyToOne
	@JoinColumn(name="person_id")
	private Person person;

	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public List<MedOrders> getMedorders() {
		return medorders;
	}
	public void setMedorders(List<MedOrders> medorders) {
		this.medorders = medorders;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Id
	int patient_id;
	String name;
	int age;

}
