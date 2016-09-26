package com.demo.dao;

import com.demo.entity.Plan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PlanDao {
    @Delete({
        "delete from plan",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into plan (id, pid, ",
        "organ, safe, technique, ",
        "project, schedule, ",
        "defect)",
        "values (#{id,jdbcType=VARCHAR}, #{pid,jdbcType=VARCHAR}, ",
        "#{organ,jdbcType=VARCHAR}, #{safe,jdbcType=VARCHAR}, #{technique,jdbcType=VARCHAR}, ",
        "#{project,jdbcType=VARCHAR}, #{schedule,jdbcType=VARCHAR}, ",
        "#{defect,jdbcType=VARCHAR})"
    })
    int insert(Plan record);

    int insertSelective(Plan record);

    @Select({
        "select",
        "id, pid, organ, safe, technique, project, schedule, defect",
        "from plan",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    Plan selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Plan record);

    @Update({
        "update plan",
        "set pid = #{pid,jdbcType=VARCHAR},",
          "organ = #{organ,jdbcType=VARCHAR},",
          "safe = #{safe,jdbcType=VARCHAR},",
          "technique = #{technique,jdbcType=VARCHAR},",
          "project = #{project,jdbcType=VARCHAR},",
          "schedule = #{schedule,jdbcType=VARCHAR},",
          "defect = #{defect,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Plan record);
}