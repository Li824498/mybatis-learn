package com.itheima.Mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {
//    @Select("select * from emp")
//    public List<Emp> list();

    @Delete("delete from emp where id = #{id}")
    public int delete(Integer id);

    @Options(keyProperty = "id", useGeneratedKeys = true)
    @Insert("insert into emp(username, name, gender, image, job, entrydate, dept_id, create_time, update_time)" +
            "    value (#{username}, #{name}, #{gender}, #{image}, #{job}, #{entrydate}, #{deptId}, #{createTime}, #{updateTime})")
    public void insert(Emp emp);

//    @Update("update emp set username = #{username}, name = #{name}, gender = #{gender}, image = #{image},job = #{job}, entrydate = #{entrydate}, dept_id = #{deptId}, update_time = #{updateTime} where id = #{id}")
    public void update(Emp emp);

    @Select("select * from emp where id = #{id}")
    public Emp getById(Integer id);


//    @Select("select  from emp where id = #{id}")
//    public Emp getById(Integer id);

//    @Select("select * from emp where name like '%${name}%' and gender = #{gender} and emp.entrydate between #{begin} and #{end} order by update_time desc")
//    public List<Emp> list(@Param("name") String name, @Param("gender")short gender, @Param("begin")LocalDate begin, @Param("end")LocalDate end);

//    @Select("select * from emp where name like concat('%',#{name} ,'%') and gender = #{gender} and emp.entrydate between #{begin} and #{end} order by update_time desc")
//    public List<Emp> list(@Param("name") String name, @Param("gender")short gender, @Param("begin")LocalDate begin, @Param("end")LocalDate end);

    public List<Emp> list(@Param("name") String name, @Param("gender")Short gender, @Param("begin")LocalDate begin, @Param("end")LocalDate end);

    public void deleteByIds(@Param("ids") List<Integer> ids);

}
