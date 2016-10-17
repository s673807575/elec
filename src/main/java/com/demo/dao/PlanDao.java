package com.demo.dao;

import com.demo.entity.Plan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface PlanDao {
    @Delete({
        "delete from plan",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into plan (id, pid, ",
        "organ, safe, technique, ",
        "project, schedule, ",
        "defect, pname)",
        "values (#{id,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER}, ",
        "#{organ,jdbcType=VARCHAR}, #{safe,jdbcType=VARCHAR}, #{technique,jdbcType=VARCHAR}, ",
        "#{project,jdbcType=VARCHAR}, #{schedule,jdbcType=VARCHAR}, ",
        "#{defect,jdbcType=VARCHAR}, #{pname,jdbcType=VARCHAR})"
    })
    int insert(Plan record);

    int insertSelective(Plan record);

    @Select({
        "select",
        "id, pid, organ, safe, technique, project, schedule, defect, pname",
        "from plan",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Plan selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "*",
            "from plan",

    })
    @ResultMap("BaseResultMap")
    List<Plan> selectALL();

    int updateByPrimaryKeySelective(Plan record);

    @Update({
        "update plan",
        "set pid = #{pid,jdbcType=INTEGER},",
          "organ = #{organ,jdbcType=VARCHAR},",
          "safe = #{safe,jdbcType=VARCHAR},",
          "technique = #{technique,jdbcType=VARCHAR},",
          "project = #{project,jdbcType=VARCHAR},",
          "schedule = #{schedule,jdbcType=VARCHAR},",
          "defect = #{defect,jdbcType=VARCHAR},",
          "pname = #{pname,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Plan record);
}