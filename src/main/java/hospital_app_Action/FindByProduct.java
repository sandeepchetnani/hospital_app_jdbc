package hospital_app_Action;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import hospital_app_entity.Encounter;
import hospital_app_entity.Items;
import hospital_app_entity.MedOrders;
import hospital_app_entity.Person;

public class FindByProduct {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Person person = entityManager.find(Person.class, 309);

		System.out.println(person.getAge());
		System.out.println(person.getId());
		System.out.println(person.getName());

		List<Encounter> encounter = person.getEncounter();
		for (Encounter encounter2 : encounter) {
			System.out.println("===================");
			System.out.println(encounter2.getAge());
			System.out.println(encounter2.getName());
			System.out.println(encounter2.getPatient_id());
			List<MedOrders> medorder = encounter2.getMedorders();
			for (MedOrders medorders : medorder) {
				System.out.println("====================");
				System.out.println(medorders.getName());
				System.out.println(medorders.getOrderNo());
				System.out.println(medorders.getValue());
				List<Items> items = medorders.getItems();
				for (Items items2 : items) {
					System.out.println("================");
					System.out.println(items2.getId());
					System.out.println(items2.getName());
					System.out.println(items2.getPrice());
				}
			}

		}

	}

}
