package pe.edu.I20221997.crud;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.I20221997.entity.City;
import pe.edu.I20221997.entity.Country;

public class JPAPersist {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("world");
        EntityManager em = emf.createEntityManager();

        Country Country = new Country("HVP", "Hanslandia", "South America", "South America", 216, 2024, 10, 1, 140, 186,
                "Hanzi", "República", "HansVP", 1, "HS", null, null);
        em.getTransaction().begin();
        em.persist(Country);
        em.getTransaction().commit();

    }
}
