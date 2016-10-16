package com.demo.dao;

import com.demo.entity.Device;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DeviceDao {
    @Delete({
        "delete from device",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into device (id, name, ",
        "type, ele_level, ",
        "rang)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=VARCHAR}, #{eleLevel,jdbcType=VARCHAR}, ",
        "#{rang,jdbcType=VARCHAR})"
    })
    int insert(Device record);

    int insertSelective(Device record);

    @Select({
        "select",
        "id, name, type, ele_level, rang",
        "from device",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Device selectByPrimaryKey(Integer id);

    @Select({
            "select",
            "id, name, type, ele_level, rang",
            "from device"
    })
    @ResultMap("BaseResultMap")
    List<Device> selectAll();

    int updateByPrimaryKeySelective(Device record);

    @Update({
        "update device",
        "set name = #{name,jdbcType=VARCHAR},",
          "type = #{type,jdbcType=VARCHAR},",
          "ele_level = #{eleLevel,jdbcType=VARCHAR},",
          "rang = #{rang,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Device record);
}