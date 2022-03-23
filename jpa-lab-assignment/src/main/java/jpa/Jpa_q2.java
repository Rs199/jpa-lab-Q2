package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.*;

public class Jpa_q2 {
	public static void main(String[] args) {

		String ath_nm;

		System.out.println("Enter the name of author= ");

		Scanner sc = new Scanner(System.in);

		ath_nm = sc.next();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		String qstr = "SELECT ba FROM Book_author ba WHERE ba.author =:auth";

		TypedQuery<Book_author> query = em.createQuery(qstr, Book_author.class);
		query.setParameter("auth", ath_nm);

		List<Book_author> answer = query.getResultList();

		answer.forEach(System.out::println);

		sc.close();

	}
}
