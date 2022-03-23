package jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import java.util.*;

public class Jpa_q4 {
	public static void main(String[] args) {

		long bk_id;

		System.out.println("Enter the book isbn= ");

		Scanner sc = new Scanner(System.in);

		bk_id = sc.nextLong();

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = factory.createEntityManager();

		String qstr = "SELECT b.title FROM Book b WHERE b.isbn =:id";

		TypedQuery<String> query = em.createQuery(qstr, String.class);
		query.setParameter("id", bk_id);

		String bk_nm = query.getSingleResult();

		String ans;
		String qstr1 = "SELECT ba.author FROM Book_author ba WHERE ba.book = :x";

		TypedQuery<String> query1 = em.createQuery(qstr1, String.class);
		query1.setParameter("x", bk_nm);

		ans = query1.getSingleResult();

		System.out.println(ans);

		sc.close();

	}
}
