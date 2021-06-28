package org.lucifer.vbluciferpro.mapper;

import org.apache.ibatis.annotations.Param;
import org.lucifer.vbluciferpro.model.Employee;

import java.util.List;

public interface EmployeeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Employee record);

    int insertSelective(Employee record);

    Employee selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);

    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size, String keyword);

    Long getTotal(String keyword);

    Integer maxWorkID();

    Integer addEmps(@Param("list") List<Employee> list);

}