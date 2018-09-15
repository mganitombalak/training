package com.ykb.api.controller;

import com.sun.deploy.net.HttpResponse;
import com.ykb.api.DepartmentRepository;
import com.ykb.api.data.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/ykb/api/department")
public class DepartmentController {


    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/")
    public List<Department> getAll(){
        return (List<Department>) departmentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Department getById(@PathVariable("id") int id){
        return departmentRepository.findById(id).get();
    }

    @PutMapping("/")
    public Department add(@RequestBody Department data, HttpServletResponse res){
        Department d =departmentRepository.save(data);
        if(d==null)
            res.setStatus(HttpServletResponse.SC_SEE_OTHER);
        else
            res.setStatus(HttpServletResponse.SC_CREATED);
        return d;
    }

    @PostMapping("/")
    public Department update(@RequestBody Department data){
        return departmentRepository.save(data);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") int id){
        departmentRepository.deleteById(id);
    }

}
