package br.edu.ifpb.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import br.edu.ifpb.entidades.Candidato;
import br.edu.ifpb.hibernate.HibernateUtil;

public class CandidatoDAO extends GenericDAO<Candidato> {
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Candidato> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Candidato> candidatos = null;

		try {
			session.beginTransaction();
			Query query = session.getNamedQuery("Candidato.getAll");
			candidatos = (List<Candidato>) query.list();
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.clear();
			session.close();
		}

		return candidatos;
	}
	
	public Candidato getByNumero(int numero) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		Candidato candidato = null;
		
		try {
			
			String hql = "from Candidato as a"
					+ " where a.numero = :numero";
			
			Query query = session.createQuery(hql);
			query.setParameter("numero", numero);
			
			candidato = (Candidato) query.uniqueResult();
	        
		} catch (HibernateException hibernateException) {
			
			session.getTransaction().rollback();
			
		} finally {
		
			session.close();
		}
		
		return candidato;
	}

	@Override
	public Candidato getById(Integer pk) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Candidato candidato = null;

		try {
			session.beginTransaction();
			candidato = (Candidato) session.get(Candidato.class, pk);
			session.getTransaction().commit();

		} catch (HibernateException hexp) {
			session.getTransaction().rollback();

		} finally {
			session.close();
		}

		return candidato;
	}
}
