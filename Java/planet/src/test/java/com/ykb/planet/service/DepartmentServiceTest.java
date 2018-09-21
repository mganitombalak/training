package com.ykb.planet.service;

import com.ykb.planet.entity.Department;
import com.ykb.planet.repository.DepartmentRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class DepartmentServiceTest {

    private DepartmentService departmentService;

    @Mock
    private DepartmentRepository departmentRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        departmentService = new DepartmentService(departmentRepository);
    }

    @Test
    public void ShouldGetAllData() {
        List<Department> data= (List<Department>) departmentService.findAll();
        assertEquals(0,data.size());
    }

    @Test
    public void ShouldDataSizeToBeCorrect() {
        // SETUP
        Department  d1 = new Department();
        d1.setId(1);
        d1.setName("Deparment1");
        Department  d2 = new Department();
        d2.setId(2);
        d2.setName("Deparment2");

        List<Department> list = new ArrayList<>();
        list.add(d1);
        list.add(d2);
        when(departmentRepository.findAll()).thenReturn(list);

        List<Department> data= (List<Department>) departmentService.findAll();
        assertEquals(list.size(),data.size());
        verify(departmentRepository,times(1)).findAll();
    }

}