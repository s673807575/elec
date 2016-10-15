package com.demo.dao;

import com.demo.entity.Examine_record;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Examine_recordDao {
    @Delete({
        "delete from examine_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into examine_record (id, pid, ",
        "did, work, examine_data, ",
        "person, result)",
        "values (#{id,jdbcType=INTEGER}, #{pid,jdbcType=INTEGER}, ",
        "#{did,jdbcType=VARCHAR}, #{work,jdbcType=VARCHAR}, #{examineData,jdbcType=TIMESTAMP}, ",
        "#{person,jdbcType=VARCHAR}, #{result,jdbcType=VARCHAR})"
    })
    int insert(Examine_record record);

    int insertSelective(Examine_record record);

    @Select({
        "select",
        "id, pid, did, work, examine_data, person, result",
        "from examine_record",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Examine_record selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "*",
            "from examine_record",
            "where pid = #{pid,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Examine_record selectBypid(Integer pid);

    @Select({
            "select",
            "*",
            "from examine_record,job",
            "where job.pid = #{pid,jdbcType=INTEGER} and job.jid=examine_record.pid"
    })
    @ResultMap("BaseResultMap")
    List<Examine_record> selectByAll(Integer pid);

    int updateByPrimaryKeySelective(Examine_record record);

    @Update({
        "update examine_record",
        "set pid = #{pid,jdbcType=INTEGER},",
          "did = #{did,jdbcType=VARCHAR},",
          "work = #{work,jdbcType=VARCHAR},",
          "examine_data = #{examineData,jdbcType=TIMESTAMP},",
          "person = #{person,jdbcType=VARCHAR},",
          "result = #{result,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Examine_record record);
}