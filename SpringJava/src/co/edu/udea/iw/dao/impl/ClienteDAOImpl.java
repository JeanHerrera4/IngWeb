/**
 * 
 */
package co.edu.udea.iw.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import co.edu.udea.iw.dao.ClienteDAO;
import co.edu.udea.iw.dto.Ciudad;
import co.edu.udea.iw.dto.Cliente;
import co.edu.udea.iw.exception.MyException;

/**
 * @author Jean.herrera
 *
 */
public class ClienteDAOImpl implements ClienteDAO {
	
	SessionFactory sessionFactory;
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Cliente> obtener() throws MyException {
		List<Cliente> clientes = new ArrayList<>();
		Session session = null;
		Criteria criteria = null;
		
		try {
			//session = DataSource.getInstance().getSession();
			session = sessionFactory.getCurrentSession();
			criteria = session.createCriteria(Cliente.class);
			criteria.addOrder(Order.asc("fechaCreacion"));
			clientes = criteria.list();
		} catch (HibernateException e) {
			throw new MyException("Error consultando la lista de clientes", e);
		} 
		
		return clientes;
	}


	@Override
	public void guardar(Cliente cliente) throws MyException {
		//Transaction tx = null;		
		Session session = null;
		try {
			//session = DataSource.getInstance().getSession();
			session = sessionFactory.getCurrentSession();
			//tx = session.beginTransaction();
			session.save(cliente);
			//tx.commit();
		} catch(HibernateException e) {
			throw new MyException("Error guardando el cliente", e);			
		}
	}
	
	

}
