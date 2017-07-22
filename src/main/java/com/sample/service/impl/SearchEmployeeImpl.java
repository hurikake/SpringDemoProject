package com.sample.service.impl;


import com.sample.dao.EmployeeDao;
import com.sample.entity.Employee;
import com.sample.service.SearchEmployee;
import org.seasar.doma.jdbc.tx.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class SearchEmployeeImpl implements SearchEmployee{

    @Autowired
    EmployeeDao employeeDao;

    @Transactional
    @Override
    public Employee searchEmployee(int employeeId) {

//        TransactionManager tm = DomaConfig.singleton().getTransactionManager();
//        tm.required(() -> {
        Employee employee = employeeDao.selectById(1);
//        });
//        List<Employee> employeeList = employeeDao.selectAll();
        return null;
    }
}
