package com.demo.dao;

import com.demo.entity.Pro_message;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface Pro_messageDao {
    @Delete({
        "delete from pro_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into pro_message (id, name, ",
        "text_type, period, ",
        "start_time, end_time)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{textType,jdbcType=VARCHAR}, #{period,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP})"
    })
    int insert(Pro_message record);

    int insertSelective(Pro_message record);

    @Select({
        "select",
        "id, name, text_type, period, start_time, end_time",
        "from pro_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Pro_message selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Pro_message record);

    @Update({
        "update pro_message",
        "set name = #{name,jdbcType=VARCHAR},",
          "text_type = #{textType,jdbcType=VARCHAR},",
          "period = #{period,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pro_message record);
}