package dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FavoriteDAO {
	private Log log = LogFactory.getLog(FavoriteDAO.class);
	
	public List<?> findByHql(String hql) { //////////////////////
		log.debug("finding LoginUser instance by hql"); 
		@SuppressWarnings("deprecation")
		SessionFactory sf= new Configuration() .configure().buildSessionFactory(); 
		Session session=sf.openSession();
		try { 
			String queryString = hql; 
			Query queryObject = session.createQuery(queryString); 
			return queryObject.list(); 
			} catch (RuntimeException re) { 
				log.error("find by hql failed", re); 
				throw re; 
			} finally{ 
					session.close(); 
					}
}

}
