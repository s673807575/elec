package com.demo.dao;

import com.demo.entity.Job;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface JobMapper {
    @Delete({
        "delete from job",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer jid);

    @Insert({
        "insert into job (jid, pid, ",
        "jcontent, jstatus)",
        "values (#{jid,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER}, ",
        "#{jcontent,jdbcType=VARCHAR}, #{jstatus,jdbcType=INTEGER})"
    })
    int insert(Job record);

    int insertSelective(Job record);

    @Select({
        "select",
        "jid, pid, jcontent, jstatus",
        "from job",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Job selectByPrimaryKey(Integer jid);

    int updateByPrimaryKeySelective(Job record);

    @Update({
        "update job",
        "set pid = #{pid,jdbcType=INTEGER},",
          "jcontent = #{jcontent,jdbcType=VARCHAR},",
          "jstatus = #{jstatus,jdbcType=INTEGER}",
        "where jid = #{jid,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Job record);
}