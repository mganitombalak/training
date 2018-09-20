package com.ykb.repository;

import com.ykb.entity.Department;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository("myrepo")
public class DepartmentRepository implements BaseRepository<Department> {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Department> getAll() {

        Session currentSession = sessionFactory.getCurrentSession();

        Query query= currentSession.createQuery("from Department",Department.class);

        return query.getResultList();
    }
}
