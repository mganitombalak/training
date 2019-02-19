package com.ibtech;

import java.util.List;
import java.util.Map;

import javax.faces.bean.*;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ibtech.persistence.AeroEntityManager;
import com.ibtech.persistence.Employee;

@ManagedBean
@ViewScoped
public class EmployeeDAO {

    private Employee entity;
    private EntityManager em;

    public EmployeeDAO() {
        if (em == null)
            em = AeroEntityManager.getEntityManager();
    }

    @SuppressWarnings("unchecked")
    public List<Employee> getAll() {
        Query queryObj = em.createQuery("SELECT e FROM Employee e");
        List<Employee> employeeList = queryObj.getResultList();
        if (employeeList != null && employeeList.size() > 0) {
            return employeeList;
        } else {
            return null;
        }
    }

    public void upsertEmployee() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        this.entity = null;
    }

    public void editPerson() {
        Map<String, String> params = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap();
        this.entity = (Employee) em.createQuery("SELECT e FROM Employee e where e.employeeNumber="
                + params.get("entityId")).getSingleResult();
        System.out.println("Edit " + params.get("entityId"));
    }

    public void listener(AjaxBehaviorEvent event) {
        System.out.println("listener called by " + event.getComponent().getClass().getName());
    }

    public Employee getEntity() {
        return entity;
    }

    public void setEntity(Employee entity) {
        this.entity = entity;
    }

}