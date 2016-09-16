package persistencia;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import beans.Pessoa;

public class UsuarioDAO implements Serializable{

	private static final long serialVersionUID = 1L;
	Session session;
	Transaction t;
	public static void inserir(Pessoa usuario){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(usuario);
		t.commit();
	}
	public static void alterar (Pessoa usuario){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.merge(usuario);
		t.commit();
	}
	public static void excluir(Pessoa usuario){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(usuario);
		t.commit();
	}
	@SuppressWarnings("unchecked")
	public static List<Pessoa> listagem(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		Query consulta = session.createQuery("from Usuario");
		List<Pessoa> lista = null;
		lista = consulta.list();
		session.close();
		return lista;
		
	}

}
