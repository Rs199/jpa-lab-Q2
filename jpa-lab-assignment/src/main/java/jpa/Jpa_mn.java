package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.*;

public class Jpa_mn {

	public static void main(String[] args) {
		
		//This program randomly adds some data into the Book, Author and Book_author tables.

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		Book bk1 = new Book(111222333, "Book1", 600);
		Book bk2 = new Book(444555666, "Book2", 2000);
		Book bk3 = new Book(777888999, "Book3", 900);

		em.getTransaction().begin();

		em.persist(bk1); em.persist(bk2); em.persist(bk3);

		Author ath1 = new Author(122333, "Author1");
		Author ath2 = new Author(455666, "Author2");
		Author ath3 = new Author(788999, "Author3");

		Book_author bkath1 = new Book_author("Book1", "Author3");
		Book_author bkath2 = new Book_author("Book2", "Author1");
		Book_author bkath3 = new Book_author("Book3", "Author2");

	
		em.persist(ath1); em.persist(ath2); em.persist(ath3);
  		em.persist(bkath1); em.persist(bkath2); em.persist(bkath3);

		

		System.out.println(bk1.toString());
		System.out.println(bk2.toString());
		System.out.println(bk3.toString());

		System.out.println(ath1.toString());
		System.out.println(ath2.toString());
		System.out.println(ath3.toString());

		System.out.println(bkath1.toString());
		System.out.println(bkath2.toString());
		System.out.println(bkath3.toString());

		em.getTransaction().commit();

	}

}
