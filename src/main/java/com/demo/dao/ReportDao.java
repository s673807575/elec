package com.demo.dao;

import com.demo.entity.Report;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ReportDao {
    @Delete({
        "delete from report",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer rid);

    @Insert({
        "insert into report (rid, rname, ",
        "pid, rang, ele_level, ",
        "device_type, text_type, ",
        "start_time, end_time, ",
        "mount, person, date, ",
        "status)",
        "values (#{rid,jdbcType=INTEGER}, #{rname,jdbcType=VARCHAR}, ",
        "#{pid,jdbcType=INTEGER}, #{rang,jdbcType=VARCHAR}, #{eleLevel,jdbcType=VARCHAR}, ",
        "#{deviceType,jdbcType=VARCHAR}, #{textType,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{mount,jdbcType=VARCHAR}, #{person,jdbcType=INTEGER}, #{date,jdbcType=TIMESTAMP}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(Report record);

    int insertSelective(Report record);

    @Select({
        "select",
        "rid, rname, pid, rang, ele_level, device_type, text_type, start_time, end_time, ",
        "mount, person, date, status",
        "from report",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Report selectByPrimaryKey(Integer rid);

    @Select({
            "select",
            "rid, rname, pid, rang, ele_level, device_type, text_type, start_time, end_time, ",
            "mount, person, date, status",
            "from report",
            "where status = 2"
    })
    @ResultMap("BaseResultMap")
    List<Report> selectunpass();

    @Select({
            "select",
            "*",
            "from report",
            "where pid = #{pid,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Report selectBypid(Integer pid);

    int updateByPrimaryKeySelective(Report record);

    @Update({
        "update report",
        "set rname = #{rname,jdbcType=VARCHAR},",
          "pid = #{pid,jdbcType=INTEGER},",
          "rang = #{rang,jdbcType=VARCHAR},",
          "ele_level = #{eleLevel,jdbcType=VARCHAR},",
          "device_type = #{deviceType,jdbcType=VARCHAR},",
          "text_type = #{textType,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "mount = #{mount,jdbcType=VARCHAR},",
          "person = #{person,jdbcType=INTEGER},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "status = #{status,jdbcType=INTEGER}",
        "where rid = #{rid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Report record);
}