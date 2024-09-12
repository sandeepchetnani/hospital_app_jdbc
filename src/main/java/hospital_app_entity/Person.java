package hospital_app_entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Person {
	
	@OneToMany(mappedBy = "person")
	private List<Encounter> encounter;
	

	
	public List<Encounter> getEncounter() {
		return encounter;
	}
	public void setEncounter(List<Encounter> encounter) {
		this.encounter = encounter;
	}
	@Id
	int id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	String name;
	int age;
	

}
