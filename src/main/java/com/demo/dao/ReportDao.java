package com.demo.dao;

import com.demo.entity.Report;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ReportDao {
    @Delete({
        "delete from report",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String id);

    @Insert({
        "insert into report (id, name, ",
        "pid, rang, ele_level, ",
        "device_type, text_type, ",
        "start_time, end_time, ",
        "mount, person, date)",
        "values (#{id,jdbcType=VARCHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{pid,jdbcType=VARCHAR}, #{rang,jdbcType=VARCHAR}, #{eleLevel,jdbcType=VARCHAR}, ",
        "#{deviceType,jdbcType=VARCHAR}, #{textType,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{mount,jdbcType=VARCHAR}, #{person,jdbcType=VARCHAR}, #{date,jdbcType=TIMESTAMP})"
    })
    int insert(Report record);

    int insertSelective(Report record);

    @Select({
        "select",
        "id, name, pid, rang, ele_level, device_type, text_type, start_time, end_time, ",
        "mount, person, date",
        "from report",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    @ResultMap("BaseResultMap")
    Report selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Report record);

    @Update({
        "update report",
        "set name = #{name,jdbcType=VARCHAR},",
          "pid = #{pid,jdbcType=VARCHAR},",
          "rang = #{rang,jdbcType=VARCHAR},",
          "ele_level = #{eleLevel,jdbcType=VARCHAR},",
          "device_type = #{deviceType,jdbcType=VARCHAR},",
          "text_type = #{textType,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "mount = #{mount,jdbcType=VARCHAR},",
          "person = #{person,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Report record);
}