package com.sample.dao;

import com.sample.config.DomaConfig;
import com.sample.entity.Employee;
import org.seasar.doma.*;

import java.util.List;

@Dao(config = DomaConfig.class)
public interface EmployeeDao {

    @Select
    List<Employee> selectAll();

    @Select
    Employee selectById(Integer id);

    @Insert
    int insert(Employee employee);

    @Update
    int update(Employee employee);

    @Delete
    int delete(Employee employee);
}
