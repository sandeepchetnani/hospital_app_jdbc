package hospital_app_entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Items {
	
	@ManyToMany(mappedBy = "items")
	private List<MedOrders> medorders;
	
	
	public List<MedOrders> getMedorders() {
		return medorders;
	}
	public void setMedorders(List<MedOrders> medorders) {
		this.medorders = medorders;
	}
	@Id
	int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	int price;
	int qty;

}
