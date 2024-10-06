package com.itheima.Mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmpMapper {
    @Select("select * from emp")
    public List<Emp> list();

    @Delete("delete from emp where id = #{id}")
    public int delete(Integer id);
}
