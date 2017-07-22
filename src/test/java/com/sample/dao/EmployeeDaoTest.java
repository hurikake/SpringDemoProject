package com.sample.dao;


import com.sample.config.DBConfig;
import com.sample.entity.Employee;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.jdbc.tx.TransactionManager;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class EmployeeDaoTest {


    DBConfig dbConfig = new DBConfig();

    private final EmployeeDao dao = new EmployeeDaoImpl(dbConfig.domaConfig());

    @Test
    public void testSelectById() {
//        TransactionManager tm = DomaConfig.singleton().getTransactionManager();
//        tm.required(() -> {
            Employee employee = dao.selectById(1);
//        });

        System.out.println("");
    }

}