package es.com.indra.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.Pessoa;
import persistencia.HibernateUtil;

public class PessoaDAO {
	private static final long serialVersionUID = 1L;
	Session session;
	Transaction t;
	public static void inserir(Pessoa pessoa){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(pessoa);
		t.commit();
	}
	public static void alterar (Pessoa pessoa){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.merge(pessoa);
		t.commit();
	}
	public static void excluir(Pessoa pessoa){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(pessoa);
		t.commit();
	}
	@SuppressWarnings("unchecked")
	public static List<Pessoa> listagem(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query consulta = session.createQuery("from Pessoa");
		List<Pessoa> lista = null;
		lista = consulta.list();
		session.close();
		return lista;
		
	}

}
