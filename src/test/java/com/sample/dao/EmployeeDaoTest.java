package com.sample.dao;

import com.sample.config.DomaConfig;
import com.sample.entity.Employee;
import org.junit.Rule;
import org.junit.Test;
import org.seasar.doma.jdbc.tx.TransactionManager;

import static org.junit.Assert.*;

public class EmployeeDaoTest {

    private final EmployeeDao dao = new EmployeeDaoImpl();

    @Test
    public void testSelectById() {
        TransactionManager tm = DomaConfig.singleton().getTransactionManager();
        tm.required(() -> {
            Employee employee = dao.selectById(1);

        });
    }

}