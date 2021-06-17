package org.lucifer.vbluciferpro.mapper;

import org.apache.ibatis.annotations.Param;
import org.lucifer.vbluciferpro.model.Hr;
import org.lucifer.vbluciferpro.model.Role;

import java.util.List;

public interface HrMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(Hr record);

    int insertSelective(Hr record);

    Hr selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);

    Hr loadUserByUsername(String username);

    List<Role> getHrRolesById(Integer id);

    List<Hr> getAllHrs(@Param("hrid") Integer hrid, @Param("keywords") String keywords);


}