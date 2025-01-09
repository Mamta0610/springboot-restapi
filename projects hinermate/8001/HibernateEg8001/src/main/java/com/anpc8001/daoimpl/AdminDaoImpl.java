package com.anpc8001.daoimpl;

import org.hibernate.Session;
import org.hibernate.query.Query;
import com.anpc8001.config.HibernateHelper;
import com.anpc8001.dao.AdminDao;
import com.anpc8001.entity.Admin;

public class AdminDaoImpl implements AdminDao{

	@SuppressWarnings("rawtypes")
	@Override
	public boolean login(String username, String password) {
		Session session = null;
        try {
            session = HibernateHelper.getSessionFactory().openSession();
            String hql = "FROM Admin WHERE username = :username AND password = :password";
            @SuppressWarnings("deprecation")
			Query query = session.createQuery(hql);
            query.setParameter("username", username);
            query.setParameter("password", password);

            Admin admin = (Admin) query.uniqueResult();

            return admin != null;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            if (session != null) session.close();
        }
    }

}
