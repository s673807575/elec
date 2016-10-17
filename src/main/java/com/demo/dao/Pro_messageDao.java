package com.demo.dao;

import com.demo.entity.Pro_message;
import com.demo.entity.Report;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface Pro_messageDao {
    @Delete({
        "delete from pro_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into pro_message (id, name, ",
        "text_type, period, ",
        "start_time, end_time, ",
        "devicemess, isqualified)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{textType,jdbcType=VARCHAR}, #{period,jdbcType=VARCHAR}, ",
        "#{startTime,jdbcType=TIMESTAMP}, #{endTime,jdbcType=TIMESTAMP}, ",
        "#{devicemess,jdbcType=VARCHAR}, #{isqualified,jdbcType=INTEGER})"
    })
    int insert(Pro_message record);

    int insertSelective(Pro_message record);



    @Select({
        "select",
        "id, name, text_type, period, start_time, end_time, devicemess, isqualified",
        "from pro_message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Pro_message selectByPrimaryKey(Integer id);

    @Select({
          "SELECT * FROM  pro_message RIGHT  JOIN report ON pro_message.id=report.pid where report.status=2 where isqualified>=2"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectALLon();

    @Select({
            "SELECT * FROM  pro_message RIGHT  JOIN report ON pro_message.id=report.pid where report.status=1 where isqualified>=2"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectALLsucc();

    @Select({
            "SELECT * FROM  pro_message RIGHT  JOIN report ON pro_message.id=report.pid where report.status=3 where isqualified>=2"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectALLfalue();

    @Select({
            "SELECT * FROM  pro_message RIGHT  JOIN report ON pro_message.id=report.pid where isqualified>=2"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectALL();

    List<Pro_message> query(Report report);

    @Select({
            "SELECT * FROM  pro_message left  JOIN report ON pro_message.id=report.pid where isqualified>=2"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectALLNo();

    int updateByPrimaryKeySelective(Pro_message record);

    @Update({
        "update pro_message",
        "set name = #{name,jdbcType=VARCHAR},",
          "text_type = #{textType,jdbcType=VARCHAR},",
          "period = #{period,jdbcType=VARCHAR},",
          "start_time = #{startTime,jdbcType=TIMESTAMP},",
          "end_time = #{endTime,jdbcType=TIMESTAMP},",
          "devicemess = #{devicemess,jdbcType=VARCHAR},",
          "isqualified = #{isqualified,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Pro_message record);

    @Select({
            "select",
            "id, name, text_type, period, start_time, end_time, devicemess, isqualified",
            "from pro_message",
            "where isqualified = 0"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectunpass();


    @Select({
            "select",
            "id, name, text_type, period, start_time, end_time, devicemess, isqualified",
            "from pro_message",
            "where isqualified = 1"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectnopass();

    @Select({
            "select",
            "id, name, text_type, period, start_time, end_time, devicemess, isqualified",
            "from pro_message",
            "where isqualified = 2"
    })
    @ResultMap("BaseResultMap")
    List<Pro_message> selectpass();


}