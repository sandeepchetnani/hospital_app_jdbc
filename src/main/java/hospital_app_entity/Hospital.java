package hospital_app_entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	@Id
	private int id;
	private String name;
	private String Loc;
	
	@OneToMany(mappedBy = "hospital")
	private List<Branch>branch;
	

	public List<Branch> getBranch() {
		return branch;
	}

	public void setBranch(List<Branch> branch) {
		this.branch = branch;
	}

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

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}

}
