package org.lucifer.vbluciferpro.mapper;

import org.apache.ibatis.annotations.Param;
import org.lucifer.vbluciferpro.model.JobLevel;
import org.lucifer.vbluciferpro.model.Position;

import java.util.List;

public interface JobLevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(JobLevel record);

    int insertSelective(JobLevel record);

    JobLevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(JobLevel record);

    int updateByPrimaryKey(JobLevel record);

    List<Position> getAllJobLevels();

    Integer deleteJobLevelsByIds(@Param("ids") Integer[] ids);

}