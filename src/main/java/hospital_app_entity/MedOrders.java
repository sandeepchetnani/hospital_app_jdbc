package hospital_app_entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
@Entity
public class MedOrders {
	
	@ManyToOne
	@JoinColumn(name="encounter_id")
	private Encounter encounter;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn(name="items_name"),inverseJoinColumns = @JoinColumn(name="medorder_no"))
	private List<Items> items;
	
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public Encounter getEncounter() {
		return encounter;
	}
	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public void setValue(double value) {
		this.value = value;
	}
	@Id
	String orderNo; 
	String name;
	double value;

	
	

}
