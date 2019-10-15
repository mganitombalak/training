package aero.tav.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public List getAll(){
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Employee");
        return query.list();
    }
}
