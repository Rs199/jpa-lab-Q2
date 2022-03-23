package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.*;

public class Jpa_q1 {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		String qstr = "SELECT b from Book b";

		TypedQuery<Book> query = em.createQuery(qstr, Book.class);

		List<Book> answer = query.getResultList();

		answer.forEach(System.out::println);

	}

}
