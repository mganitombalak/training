package com.ykb.planet;


import com.ykb.planet.entity.Department;
import org.junit.*;

import static org.junit.Assert.*;

public class DepartmentTest {

    private Department department;

    @BeforeClass
    public static void TearUp(){
        System.out.println("Before class");
    }

    @Before
    public void setup(){
        department=new Department();
        System.out.println("Before");
    }

    @Test
    public void ShouldIdBeSetted(){
        int expectedId = 1;

        department.setId(expectedId);

        assertEquals(expectedId,department.getId());
    }

    @Test
    public void ShoudNameBeSetted(){
        String expectedName="DUMMY DEPARTMENT";

        department.setName(expectedName);

        assertEquals(expectedName,department.getName());
    }

    @After
    public void end(){
        System.out.println("After");
    }

    @AfterClass
    public static void TearDown(){
        System.out.println("After class");
    }

}
