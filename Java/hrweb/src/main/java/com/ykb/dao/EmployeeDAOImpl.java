package com.ykb.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List getAll() {
     Session currentSession =sessionFactory.getCurrentSession();
        Query query = currentSession.createQuery("from Employee");
        return query.list();
    }
}
