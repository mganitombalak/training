package com.ykb.planet.controllers;

import com.ykb.planet.service.DepartmentService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class DepartmentControllerTest {

    @Mock
    Model model;

    @Mock
    private DepartmentService departmentService;

    private  DepartmentController departmentController;


    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);
        departmentController=new DepartmentController(departmentService);
    }

    @Test
    public void index() {
        String viewName = departmentController.index(model);
        assertEquals("department/index",viewName);
        verify(departmentService,times(1)).findAll();
        verify(model,times(1)).addAttribute(eq("departments"),anyIterable());
    }
}