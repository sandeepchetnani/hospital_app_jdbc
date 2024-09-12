package hospital_app_Action;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hospital_app_entity.Address;
import hospital_app_entity.Branch;
import hospital_app_entity.Encounter;
import hospital_app_entity.Hospital;
import hospital_app_entity.Items;
import hospital_app_entity.MedOrders;
import hospital_app_entity.Person;

public class Save {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Hospital hospital = new Hospital();
		hospital.setId(2);
		hospital.setName("alexis");
		hospital.setLoc("nagpur");

		Branch branch = new Branch();
		branch.setBranch_id(102);
		branch.setName("cici");
		branch.setLocation("jaripatka");

		Branch branch1 = new Branch();
		branch1.setBranch_id(103);
		branch1.setName("cici");
		branch1.setLocation("jaripatka");

		List<Branch> branches = Arrays.asList(branch, branch1);

		Encounter encounter = new Encounter();
		encounter.setName("deep");
		encounter.setAge(22);
		encounter.setPatient_id(203);

		Encounter encounter1 = new Encounter();
		encounter1.setName("jay");
		encounter1.setAge(23);
		encounter1.setPatient_id(202);

		List<Encounter> ecounters = Arrays.asList(encounter, encounter1);

		Person person = new Person();
		person.setId(309);
		person.setAge(21);
		person.setName("deep");

		Address address = new Address();
		address.setCity("pune");
		address.setNumber(405);
		address.setPincode(440014);

		MedOrders medorders = new MedOrders();
		medorders.setOrderNo("604");
		medorders.setName("delivery");
		medorders.setValue(5000);

		MedOrders medorders1 = new MedOrders();
		medorders1.setOrderNo("605");
		medorders1.setName("delivery");
		medorders1.setValue(20000);

		List<MedOrders> medorderss = Arrays.asList(medorders,medorders1);

		Items items = new Items();
		items.setId(901);
		items.setName("antaacid");
		items.setPrice(30);
		items.setQty(5);

		List<Items> itemss = Arrays.asList(items);

		hospital.setBranch(branches);

		branch.setHospital(hospital);
		branch.setAddress(address);
		branch.setEcounter(ecounters);

		address.setBranch(branch);

		encounter.setBranch(branch);
		encounter.setPerson(person);
		encounter.setMedorders(medorderss);

		person.setEncounter(ecounters);

		items.setMedorders(medorderss);

		medorders.setEncounter(encounter);
		medorders.setItems(itemss);

		entityTransaction.begin();

		entityManager.persist(hospital);
		entityManager.persist(branch);
		entityManager.persist(address);
		entityManager.persist(encounter);
		entityManager.persist(medorders);
		entityManager.persist(items);
		entityManager.persist(person);
		entityTransaction.commit();

	}

}
