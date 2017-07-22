package com.sample.dao;

import com.sample.config.DomaConfig;
import com.sample.entity.Employee;
import org.seasar.doma.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@AnnotateWith(annotations = {
        @Annotation(target = AnnotationTarget.CLASS, type = Repository.class),
//        @Annotation(target = AnnotationTarget.CONSTRUCTOR, type = Autowired.class),
//        @Annotation(target = AnnotationTarget.CONSTRUCTOR_PARAMETER, type = DomaConfig.class)
})
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
